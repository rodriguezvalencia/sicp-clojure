(defn tree-map [f tree]
  (map #(if (list? %)
          (tree-map f %)
          (f %)) tree))

(defn square-tree [tree] (tree-map #(* % %) tree))

(square-tree (list 1 (list 2 (list 3 4) 5) (list 6 7)))