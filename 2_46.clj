(defn make-vect [x y] (list x y))
(defn x [vect] (first vect))
(defn y [vect] (last vect))

(defn add-vect [v1 v2] (make-vect (+ (x v1) (x v2)) (+ (y v1) (y v2))))
(defn sub-vect [v1 v2] (make-vect (- (x v1) (x v2)) (- (y v1) (y v2))))
(defn scale-vect [v s] (make-vect (* s (x v)) (* s (y v))))