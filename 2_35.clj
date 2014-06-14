(load-file "2_33.clj")

(defn count-leaves [t]
  (accumulate #(+ (if (list? %1) (count-leaves %1) 1) %2) 0 (map #(if (list? %) % 1) t)))