(defn areEqual? [a b]
  (if (and (list? a) (list? b))
    (or (= '() a b)
      (and (areEqual? (first a) (first b))
        (areEqual? (rest a) (rest b))))
    (= a b)))