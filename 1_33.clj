(defn accFilter [combiner nullV term a next b filter]
  (defn iter [a result]
    (if (> a b)
      result
      (iter (next a) (combiner result (if (filter a) (term a) nullV)))))
  (iter a nullV))

(accFilter + 0 identity 1 inc 10 #(< % 5))