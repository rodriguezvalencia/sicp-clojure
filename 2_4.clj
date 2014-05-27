(defn my-cons [x y]
  #(% x y))

(defn my-car [z]
  (z (fn [p q] p)))

(defn my-cdr [z]
  (z (fn [p q] q)))

(def tal (my-cons 3 5))
(my-cdr tal)
(my-cdr tal)