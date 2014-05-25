(defn gcd [a b]
  (if (= b 0)
    a
    (gcd b (mod a b))))

(defn make-rat [n d]
  (if (< 0 d)
    (make-rat (* -1 n) (* -1 d))
  (let [g (gcd n d)]
    (list (/ n g) (/ d g)))))