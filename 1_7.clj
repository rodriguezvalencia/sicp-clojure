(defn average [x y] (/ (+ x y) 2))
(defn improve [guess x] (average guess (/ x guess)))
(defn abs [x] (if (< x 0) (- x) x))
(defn square [x] (* x x))
(defn good [guess x] (< (abs (- (square guess) x)) 0.001))
(defn sq-it [guess x]
   (if (good guess x)
        guess
        (sq-it (improve guess x) x)))
