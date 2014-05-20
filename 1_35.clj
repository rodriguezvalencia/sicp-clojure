(defn abs [x] (if (< x 0) (* -1 x) x))
(defn avg [a b] (/ (+ a b) 2))

(defn fixed-point [f guess tolerance]
  (let [close? #(< (abs (- %1 %2)) tolerance)
        next (f guess)]
    (if (close? guess next)
      next
      (fixed-point f next tolerance))
    )
  )

(defn sqrt [x]
  (double (fixed-point #(avg % (/ x %)) 1 0.00001)))


(defn golden-point [x]
  (+ 1 (/ 1 x)))

(def phi (double (fixed-point golden-point 1 0.00001)))