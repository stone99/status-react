(ns syng-im.components.chat.chat-message-new
  (:require
   [re-frame.core :refer [subscribe dispatch dispatch-sync]]
   [syng-im.components.react :refer [android?
                                     view
                                     image
                                     text
                                     text-input
                                     touchable-highlight]]
   [syng-im.components.chat.plain-message-input :refer [plain-message-input-view]]
   [syng-im.components.chat.input.simple-command :refer [simple-command-input-view]]
   [syng-im.components.chat.input.phone :refer [phone-input-view]]
   [syng-im.components.chat.input.password :refer [password-input-view]]
   [syng-im.components.chat.input.money :refer [money-input-view]]
   [syng-im.utils.utils :refer [log toast http-post]]
   [syng-im.utils.logging :as log]
   [syng-im.resources :as res]
   [reagent.core :as r]))

(defn default-command-input-view [command]
  [simple-command-input-view command {}])

(defn special-input-view [command]
  (case (:command command)
    :phone [phone-input-view command]
    :keypair-password [password-input-view command]
    :money [money-input-view command]
    :request [money-input-view command]
    [default-command-input-view command]))

(defn chat-message-new []
  (let [input-command-atom (subscribe [:get-input-command])]
    (fn []
      (let [input-command @input-command-atom]
        [view ;; TODO temp to show input above react-native warning 
         {:style {:marginBottom 50}}
         (if input-command
           [special-input-view input-command]
           [plain-message-input-view])]))))