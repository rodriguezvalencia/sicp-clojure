(defn split [firstOp secondOp]
  (fn me [painter n]
    (if (= n 0)
      painter
      (let [smaller (me painter (dec n))]
        (firstOp painter (secondOp smaller smaller))))))

(def right-split (split :beside :below))
(def up-split (split :below :beside))
