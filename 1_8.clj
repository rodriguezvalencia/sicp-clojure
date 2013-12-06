(defn abs [x] (if (< x 0) (- x) x))
(defn square [x] (* x x))
(defn cube [x] (* x x x))
(defn improve [guess x] (/ (+ (/ x (square guess)) (* 2 guess)) 3))
(defn good [guess x] (< (abs (- (cube guess) x)) 0.001))
(defn cu-it [guess x]
   (if (good guess x)
        guess
        (cu-it (improve guess x) x)))
