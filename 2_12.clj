(load-file "2_7.clj")

(defn make-center-width [c w]
  (make-interval (- c w) (+ c w)))
(defn center [i]
  (/ (+ (lower-bound i) (upper-bound i)) 2))
(defn width [i]
  (/ (- (upper-bound i) (lower-bound i)) 2))


(defn make-center-percent [c p]
  (make-center-width c (/ (* c p) 100)))
(defn percent [i]
  (/ (- (upper-bound i) (center i)) (center i)))