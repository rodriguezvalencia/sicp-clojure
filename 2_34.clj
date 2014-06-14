(load-file "2_33.clj")

(defn horner-eval [x coefficient-sequence]
  (accumulate #(+ %1 (* x %2))
    0
    coefficient-sequence))