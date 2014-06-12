(defn make-mobile [left right]
  (list left right))

(defn make-branch [length structure]
  (list length structure))

(defn left-branch [mobile] (first mobile))
(defn right-branch [mobile] (last mobile))
(defn branch-length [branch] (first branch))
(defn branch-structure [branch] (last branch))

# if mobile and branch are built with cons...
#(defn make-mobile [left right]
#  (cons left right))
#(defn make-branch [length structure]
#  (cons length structure))
#(defn left-branch [mobile] (first mobile))
#(defn right-branch [mobile] (rest mobile))
#(defn branch-length [branch] (first branch))
#(defn branch-structure [branch] (rest branch))

(defn total-weight [mobile]
  (defn branch-weight [branch]
    (let [struc (branch-structure branch)]
      (if (list? struc)
        (total-weight struc)
        struc))
    )
  (+
    (branch-weight (left-branch mobile))
    (branch-weight (right-branch mobile))))

(defn torque [branch]
  (let [struc (branch-structure branch)
        weight (if (list? struc) (total-weight struc) struc)]
  (* (branch-length branch) weight)))

(defn balanced [mobile]
  (if (list? mobile)
    (let [left (left-branch mobile)
          right (right-branch mobile)]
      (and (= (torque left) (torque right)) (balanced (branch-structure left)) (balanced (branch-structure right))))
    true)
  )
