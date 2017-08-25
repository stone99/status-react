(ns status-im.components.toolbar-new.actions
  (:require [re-frame.core :refer [dispatch]]
            [status-im.accessibility-ids :as id]
            [status-im.components.toolbar-new.styles :as st]))

(defn hamburger [handler]
  {:icon    :icons/hamburger
   :handler handler})

(defn add [handler]
  {:icon    :icons/add
   :handler handler})

(defn opts [options]
  {:icon    :icons/options
   :options options})

(defn search [handler]
  {:icon    :icons/search
   :handler handler})

(def search-icon
  {:icon {:source {:name :icons/search}
          :style  {:opacity 0.4}}})

(defn back [handler]
  {:icon                :icons/back
   :handler             handler
   :accessibility-label id/toolbar-back-button})

(def default-back
  (back #(dispatch [:navigate-back])))

(defn back-white [handler]
  {:icon    {:source {:name  :icons/back
                      :color :white}}
   :handler handler})

(defn close [handler]
  {:icon    :icons/close
   :handler handler})

(defn close-white [handler]
  {:icon    {:source {:name  :icons/close
                      :color :white}}
   :handler handler})

(defn list-white [handler]
  {:image   {:source {:uri :icon_list_white}
             :style  st/action-default}
   :handler handler})
