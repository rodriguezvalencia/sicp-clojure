(defn abs [x] (if (< x 0) (* -1 x) x))
(defn avg [a b] (/ (+ a b) 2))

(defn fixed-point [f guess tolerance count]
  (let [close? #(< (abs (- %1 %2)) tolerance)
        next (avg guess (f guess))]
    (println "trying with " guess ", count " count)
    (if (close? guess next)
      next
      (fixed-point f next tolerance (inc count)))
    )
  )



(def dx 0.000001)
(defn deriv [g]
  #(/ (- (g (+ % dx)) (g %))
      dx))

(defn newton-transform [g]
  #(- % (/ (g %) ((deriv g) %))))

(defn newtons-method [g guess]
  (fixed-point (newton-transform g) guess 0.00001 0))

(defn cubic [a b c]
  #(+ (* % % %) (* a (* % %)) (* b %) c))