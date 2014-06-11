(defn same-parity [f & l]
  (cons f (if (odd? f) (filter odd? l) (filter even? l))))