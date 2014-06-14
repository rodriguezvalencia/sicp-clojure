(defn accumulate-n [op init seqs]
  (if (empty? (first seqs))
    nil
    (cons (accumulate op init (map first seqs))
      (accumulate-n op init (map rest seqs)))))

(def s (list (list 1 2 3) (list 4 5 6) (list 7 8 9) (list 10 11 12)))