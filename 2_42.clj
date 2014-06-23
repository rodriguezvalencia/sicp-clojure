(load-file "2_40.clj")

; each entry represents a row/column in the board, containing an integer for the queen at that cell
(def empty-board (list))

(defn safe-straights [board]
  (= (count (set board)) (count board)))

(defn safe-diag [queen board]
  (let [diag (map #(- % queen) (range (count board)))]
    (and (safe-straights (map + board diag))
         (safe-straights (map + board (reverse diag))))))

(defn safe? [queen board]
  (and (safe-straights board)
    (safe-diag queen board)))

(defn adjoin-position [new-row k rest-of-queens]
  (cons new-row rest-of-queens))

(defn queens [board-size]
  (defn queen-cols [k]
    (if (= k 0)
      (list empty-board)
      (filter
        (fn [positions] (safe? k positions))
        (flatmap
          (fn [rest-of-queens]
            (map (fn [new-row]
                   (adjoin-position new-row k rest-of-queens))
              (range board-size)))
          (queen-cols (- k 1))))))
  (queen-cols board-size))