(ns status-im.bots.models)

(defn set-in-bot-db
  [{:keys [current-chat-id] :as db} {:keys [bot path value]}]
  (let [bot (or bot current-chat-id)]
    (assoc-in db (concat [:bot-db bot] path) value)))

(defn update-bot-db
  [{:keys [current-chat-id] :as db} {:keys [bot db]}]
  (let [bot (or bot current-chat-id)]
    (update-in db [:bot-db bot] merge db)))

(defn clear-bot-db
  [{:keys [current-chat-id] :as db}]
  (assoc-in db [:bot-db current-chat-id] nil))
