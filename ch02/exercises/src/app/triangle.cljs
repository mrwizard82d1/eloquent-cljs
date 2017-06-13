(ns app.triangle
  (:require [clojure.string :as str]))

(defn run
  "Print out a triangle with `n - 1` rows."
  [n]
  (println (str/join "\n"
                     (for [n (range 1 (inc n))]
                          (str/join "" (repeat n "#"))))))
