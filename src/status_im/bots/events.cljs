(ns status-im.bots.events
  (:require [re-frame.core :refer [trim-v]]
            [status-im.utils.handlers :refer [register-handler-db]]
            [status-im.bots.models :as bots-model]))

;;;; Handlers

(register-handler-db
 :set-in-bot-db
 [trim-v]
 (fn [db [params]]
   (bots-model/set-in-bot-db db params)))

(register-handler-db
 :update-bot-db
 [trim-v]
 (fn [db [params]]
   (bots-model/update-bot-db db params)))
