(defn up-split [painter n]
  (if (= n 0)
    painter
    (let [smaller (up-split painter (dec n))]
      (:below (:beside smaller smaller) painter))))