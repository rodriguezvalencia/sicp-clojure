(def x (list (list 1 2) (list 3 4)))

(defn fringe [x]
  (let [[h & t] x
        head (if (list? h) (fringe h) (list h))]
    (if (empty? t)
      head
      (concat head (fringe t))
     )))