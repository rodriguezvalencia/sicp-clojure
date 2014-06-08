(defn last-pair [l]
  (if (empty? (rest l))
    (first l)
    (last-pair (rest l)))
  )

(defn last-pair-destructuring [l]
  (let [[h & t] l]
  (if (empty? t)
    h
    (last-pair t)))
  )