(defn subsets [s]
  (if (empty? s)
    (list nil)
    (let [the-rest (subsets (rest s))]
      (concat the-rest (map #(cons (first s) %) the-rest)))))

(subsets '(1 2 3))