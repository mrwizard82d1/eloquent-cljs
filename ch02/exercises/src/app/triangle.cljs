(ns app.triangle
  (:require [clojure.string :as str]))

(defn run
  "Print out a triangle."
  []
  (println (str/join "\n"
                     (for [n (range 1 7)]
                          (str/join ""
                                    (repeat n "#"))))))
