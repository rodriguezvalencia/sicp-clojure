(defn compose [f g] #(f (g %)))
(defn repeated [f n]
  (if (= n 0)
    f
    (compose f (repeated f (dec n)))
    ))

((repeated square 2) 5)