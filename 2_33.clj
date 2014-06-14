(defn accumulate [op initial sequence]
  (if (empty? sequence)
    initial
    (op (first sequence)
      (accumulate op initial (rest sequence)))))


(defn my-map [p sequence]
  (accumulate #(cons (p %1) %2) nil sequence))
(defn my-append [seq1 seq2]
  (accumulate cons seq2 seq1))
(defn my-length [sequence]
  (accumulate #(+ 1 %2) 0 sequence))