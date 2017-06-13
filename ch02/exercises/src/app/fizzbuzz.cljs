(ns app.fizzbuzz
  (:require [clojure.string :as str]))

(defn generate-numbers [n]
      (range 1 (inc n)))

(defn calculate-fizz-buzz [n]
      (cond
        (and (= (rem n 3) 0) (= (rem n 5) 0)) "fizzbuzz"
        (= (rem n 3) 0) "fizz"
        (= (rem n 5) 0) "buzz"
        :else n))

(defn replace-with-fizz-buzz [ns]
  (map calculate-fizz-buzz ns))

(defn partition-by-5s [xs]
      (partition 5 xs))

(defn format-fizzbuzz [partitions]
      (str/join "\n" (map #(str/join " " %) partitions)))

(defn run [n]
  (println (format-fizzbuzz (partition-by-5s (replace-with-fizz-buzz (generate-numbers n))))))
