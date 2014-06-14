(load-file "2_33.clj")

(defn fold-left [op initial sequence]
  (defn iter [result l]
    (if (empty? l)
      result
      (iter (op result (first l))
        (rest l))))
  (iter initial sequence))

(def fold-right accumulate)

(defn fr-reverse [sequence]
  (fold-right #(concat %2 (list %1)) nil sequence))

(defn fl-reverse [sequence]
  (fold-left #(concat (list %2) %1) nil sequence))