(defn square-tree [tree]
  (map #(if (list? %)
          (square-tree %)
          (* % %)) tree))

(square-tree
  (list 1
    (list 2 (list 3 4) 5)
    (list 6 7)))