(defn cont-frac [d n k s]
  (if (= k s)
    (/ (n s) (d s))
    (/ (n s) (+ (d s) (cont-frac d n k (inc s))))))

(double (cont-frac (fn [x] 1) (fn [x] 1) 11 1))