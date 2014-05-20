(defn cont-frac [d n k s]
  (if (= k s)
    (/ (n s) (d s))
    (/ (n s) (+ (d s) (cont-frac d n k (inc s))))))


(defn d [x]
  (+ 1 (* 2 (dec x))))

(defn tan-cf [x k]
  (let  [n  (fn [v]
    (if (= v 1)
      x
      (* x x)))]
  (double (cont-frac d n k 1))))