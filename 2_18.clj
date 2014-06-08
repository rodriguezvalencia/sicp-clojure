
(defn do-reverse [l rl]
  (let [[h & t] l]
    (if (empty? t)
      (cons h rl)
      (do-reverse t (cons h rl))
      )
    ))

(defn my-reverse [l]
  (do-reverse l nil)
  )
