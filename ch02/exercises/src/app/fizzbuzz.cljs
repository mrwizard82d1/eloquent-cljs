(ns app.fizzbuzz)

(defn generate-numbers [n]
      (range 1 n))

(defn calculate-fizz-buzz [n]
      (cond
        (and (= (rem n 3) 0) (= (rem n 5) 0)) "fizzbuzz"
        (= (rem n 3) 0) "fizz"
        (= (rem n 5) 0) "buzz"
        :else n))

(defn replace-with-fizz-buzz [ns]
  (map calculate-fizz-buzz ns))

(defn run [n]
  (println (replace-with-fizz-buzz (generate-numbers n))))
