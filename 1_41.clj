(defn dbl [f] #(f (f %)))

(((double (double double)) inc) 5)