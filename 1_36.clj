(defn abs [x] (if (< x 0) (* -1 x) x))
(defn avg [a b] (/ (+ a b) 2))

(defn fixed-point [f guess tolerance count]
  (let [close? #(< (abs (- %1 %2)) tolerance)
        next (f guess)]
    (println "trying with " guess ", count " count)
    (if (close? guess next)
      next
      (fixed-point f next tolerance (inc count)))
    )
  )

(defn fixed-point-avg [f guess tolerance count]
  (let [close? #(< (abs (- %1 %2)) tolerance)
        next (avg guess (f guess))]
    (println "trying with " guess ", count " count)
    (if (close? guess next)
      next
      (fixed-point f next tolerance (inc count)))
    )
  )

(defn f [x]
  (/ (Math/log 1000) (Math/log x)))

(def solucion (double (fixed-point-avg f 15 0.00001 0)))