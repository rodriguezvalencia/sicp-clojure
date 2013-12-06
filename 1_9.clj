(defn average [x y] (/ (+ x y) 2))
(defn abs [x] (if (< x 0) (- x) x))
(defn square [x] (* x x))
(defn improve [guess x] (/ (+ (/ x (square guess)) (* 2 guess)) 3)) 
(defn good [guess x] (< (abs (- (square guess) x)) 0.001))
(defn sq-it [guess x]
   (if (good guess x)
        guess
        (sq-it (improve guess x) x)))
