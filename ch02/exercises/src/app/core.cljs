(ns app.core
  (:require [cljs.nodejs :as nodejs]
            [app.triangle :as triangle]
            [app.fizzbuzz :as fizzbuzz]))

(nodejs/enable-util-print!)

(defn main [& args]
  (println "Abracadabra!")
  (triangle/run 7)
  (fizzbuzz/run 100))

(set! *main-cli-fn* main)
