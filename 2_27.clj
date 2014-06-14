(load-file "2_18.clj")

(def x (list (list 1 2) (list 3 4)))

(defn deep-reverse [l rl]
  (defn aux-reverse [h t rl]
    (if (empty? t)
      (cons h rl)
      (deep-reverse t (cons h rl))
      ))
  (let [[h & t] l]
    (if (list? h)
      (aux-reverse (deep-reverse h nil) t rl)
      (aux-reverse h t rl)
      )
    ))

(defn my-deep-reverse [l]
  (deep-reverse l nil)
  )