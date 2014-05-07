(defn prod [term a next b]
  (defn iter [a result]
    (if (> a b)
      result
      (iter (next a) (* result (term a)))))
  (iter a 1))

(prod identity 1 inc 10)

(defn pi [max]
  (let [dbl #(* 2 %)]
    (let [fun #(* (/ (dbl %) (dec (dbl %))) (/ (dbl %) (inc (dbl %))))]
      (dbl (prod fun 1 inc max))
      )
    )
  )

(prod #(* % % %) 1 inc 10)