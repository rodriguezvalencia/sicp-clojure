(defn cont-frac [d n k s]
  (if (= k s)
    (/ (n s) (d s))
    (/ (n s) (+ (d s) (cont-frac d n k (inc s))))))


(defn d [x]
  (let [next (inc x)]
    (if (= (mod next 3) 0 )
      (* 2 (/ next 3))
      1)))

(+ 2 (double (cont-frac d (fn [x] 1) 11 1)))