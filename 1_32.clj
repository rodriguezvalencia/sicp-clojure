(defn accIter [combiner nullV term a next b]
  (defn iter [a result]
    (if (> a b)
      result
      (iter (next a) (combiner result (term a)))))
  (iter a nullV))

(defn accRec [combiner nullV term a next b]
  (if (> a b)
    nullV
    (combiner (term a)
      (accRec combiner nullV term (next a) next b))))

(accRec * 1 identity 1 inc 4)

(accRec + 0 identity 1 inc 5)