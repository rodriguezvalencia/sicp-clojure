(load-file "2_46.clj")
(defn make-segment [start end] (list start end))
(defn start-segment [s] (first s))
(defn end-segment [s] (add-vect (first s) (last s)))