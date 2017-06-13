(ns app.core
  (:require [cljs.nodejs :as nodejs]
            [app.triangle :as triangle]))

(nodejs/enable-util-print!)

(defn main [& args]
  (println "Abracadabra!")
  (triangle/run))

(set! *main-cli-fn* main)
