(load-file "1_35.clj")
(load-file "1_43.clj")

(defn improve-sqrt [x guess]
  (/ (+ guess (/ x guess)) 2) )

(defn good? [x nextX]
  (< (abs (- x nextX)) 0.0001))

(defn iterative-improve [good? improve guess]
  #(if (good? guess (improve % guess))
     guess
     ((iterative-improve good? improve (improve % guess)) %))
  )

(float ((iterative-improve good? improve-sqrt 1) 2))