(defn make-frame [origin edge1 edge2]
  (list origin edge1 edge2))

(defn origin [frame] (first frame))
(defn edge1 [frame] (first (rest frame)))
(defn edge2 [frame] (last frame))