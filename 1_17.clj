(defn mult [b n] (fast-mult 0 b n))

(defn mydouble [x] (* x 2))
(defn halve [x] (/ x 2))

(defn fast-mult [acc b n]
  (if (= n 1) (+ acc b)
    (if (odd? n)
      (fast-mult (+ acc b) b (dec n))
      (fast-mult acc (mydouble b) (halve n))
      )
    )
  )
