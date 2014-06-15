; from SICP 1.2.6
(defn divides? [divisor n]
  (= 0 (mod n divisor)))

(defn find-divisor [n test-divisor]
  (cond
    (> (#(* % %) test-divisor) n) n
    (divides? test-divisor n) test-divisor
    :else (find-divisor n (+ test-divisor 1))))

(defn smallest-divisor [n]
  (find-divisor n 2))


(defn divides? [a b]
  (= (mod b a) 0))

(defn prime? [n]
  (= n (smallest-divisor n)))