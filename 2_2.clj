(defn make-point [x y] (list x y))
(defn x-point [point] (first point))
(defn y-point [point] (last point))

(defn make-segment [pointA pointB]
  (list pointA pointB))

(defn start-segment [segment] (first segment))
(defn end-segment [segment] (last segment))

(defn mid-point [segment]
  (make-point
    (/
      (+
        (x-point (start-segment segment))
        (x-point (end-segment segment)))
      2)
    (/
      (+
        (y-point (start-segment segment))
        (y-point (end-segment segment)))
      2)))

(defn print-point [p]
  (println "(" (x-point p) "," (y-point p) ")"))