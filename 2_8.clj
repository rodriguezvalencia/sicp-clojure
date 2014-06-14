(load-file "2_7.clj")

(defn sub-interval [x y]
  (make-interval (+ (lower-bound x) (upper-bound y))
    (+ (upper-bound x) (lower-bound y))))
