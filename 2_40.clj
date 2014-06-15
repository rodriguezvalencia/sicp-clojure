(load-file "2_33.clj")
(load-file "prime.clj")

(defn flatmap [proc seq]
  (accumulate concat nil (map proc seq)))

;(defn unique-pairs [n]
;(accumulate concat
;  nil
;  (map (fn [i] (map #(list i %) (range 1 i))) (range 1 (inc n)))))

(defn unique-pairs [n]
  (flatmap (fn [i] (map #(list i %) (range 1 i))) (range 1 (inc n))))

(defn make-pair-sum [pair]
  (list (first pair) (second pair) (+ (first pair) (second pair))))

(defn prime-sum? [pair]
  (prime? (+ (first pair) (second pair))))

(defn prime-sum-pairs [n]
  (map make-pair-sum
    (filter prime-sum?
      (unique-pairs n))))