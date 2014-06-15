(load-file "2_33.clj")

(defn make-triplets [n]
   (flatmap (fn [i] (map #(conj i %) (range (inc (apply max i)) (inc n)))) (unique-pairs n)))

(defn get-nums [n s]
  (filter #(< (reduce + %) s) (make-triplets n)))