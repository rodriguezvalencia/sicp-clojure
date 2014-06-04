(:use ["2_8.clj"])

(defn has-zero [x]
  (or (= 0 (upper-bound x)) (= 0 (lower-bound x))))

(defn div-interval [x y]
  (if (has-zero y)
    (println "interval spans zero")
  (mul-interval x
    (make-interval (/ 1.0 (upper-bound y))
      (/ 1.0 (lower-bound y))))))