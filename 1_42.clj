(defn compose [f g] #(f (g %)))
((compose #(* % %) inc) 6)