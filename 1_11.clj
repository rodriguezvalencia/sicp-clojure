(defn f [x] 
  (if (< x 3) x (+ (f (dec x)) (* 2 (f (- x 2))) (* 3 (f (- x 3))))))

(defn f-iter [x] 
  (if (< x 3) x
  (fi x 0 1 2 0)))
(defn fi [x a b c acc]
  (if (< x 3) acc
  (let [d (+ (* 3 a) (* 2 b) c)]
    (fi (dec x) b c d d))))
