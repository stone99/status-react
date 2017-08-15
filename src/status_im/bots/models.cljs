(ns status-im.bots.models)

(defn set-in-bot-db
  [{:keys [current-chat-id] :as db} {:keys [bot path value]}]
  (let [bot (or bot current-chat-id)]
    (assoc-in db (concat [:bot-db bot] path) value)))
