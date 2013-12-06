(defn pascal [row, col]
  (if (= row 0)
    (if (= col 0) 1 0)
    (+ (pascal (dec row) (dec col)) (pascal (dec row) col))))
