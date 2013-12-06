(defn exp [b n] (fast-exp 1 b n))

(defn fast-exp [acc b n]
  (if (= n 1) (* acc b)
    (if (odd? n)
      (fast-exp (* acc b) b (dec n))
      (fast-exp acc (* b b)(/ n 2))
      )
    )
  )
