(defn square-list [items]
  (if (empty? items)
    nil
    (cons (* (first items) (first items)) (square-list (rest items)))))

(defn square-list [items]
  (map #(* % %) items))

