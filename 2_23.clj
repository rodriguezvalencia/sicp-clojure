(defn for-each [p l]
  (if (empty? l)
    nil
    (do (p (first l))
      (for-each p (rest l)))))

(for-each #(println %) '(1 2 3 4))