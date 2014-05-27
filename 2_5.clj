(defn my-int-cons [a b]
  (* (Math/pow 2 a) (Math/pow 3 b)))

(defn my-int-car [x]
  (my-int-reduce x 2))

(defn my-int-cdr [x]
  (my-int-reduce x 3))

(defn my-int-reduce [x n]
  (if (= (mod x n) 0)
    (+ 1 (my-int-reduce (/ x n) n) )
    0))

(def my-num (my-int-cons 4 8))
(my-int-car my-num)
(my-int-cdr my-num)