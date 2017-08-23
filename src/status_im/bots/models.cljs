(ns status-im.bots.models)

(defn set-in-bot-db
  [{:keys [current-chat-id] :as app-db} {:keys [bot path value]}]
  (let [bot (or bot current-chat-id)]
    (assoc-in app-db (concat [:bot-db bot] path) value)))

(defn update-bot-db
  [{:keys [current-chat-id] :as app-db} {:keys [bot db]}]
  (let [bot (or bot current-chat-id)]
    (update-in app-db [:bot-db bot] merge db)))

(defn clear-bot-db
  [{:keys [current-chat-id] :as app-db}]
  (assoc-in app-db [:bot-db current-chat-id] nil))
