(ns status-im.js-dependencies)

(def awesome-phonenumber (js/require "awesome-phonenumber"))
(def Chance              (js/require "chance"))
(def eccjs               (js/require "eccjs"))
(def emojis              (js/require "emojilib"))
(def homoglyph-finder    (js/require "homoglyph-finder"))
(def identicon-js        (js/require "identicon.js"))
(def Web3                (js/require "web3"))
(def BigNumber           (js/require "bignumber.js"))
;;(def FCM                 (js/require "react-native-fcm"))

;; Aug 23 13:29:45 Oskars-MBP StatusIm[84013] <Error>: { [Error: No *print-fn* fn set for evaluation environment] line: 37, column: 17 }
;;(println "Before requiring fcm")

;;(def react-native-fcm (js/require "react-native-fcm"))
;;(def FCM (aget react-native-fcm "default"))
;;(println "Asserted react-native-fcm")
;;(assert react-native-fcm)
;;(println "Asserted FCM")
;;(assert FCM)

;; Should work?
