
(defn big [a b] (if (> a b) a b))
(defn small [a b] (if (< a b) a b))
(defn sq [a] (* a a))
(defn tal [a b c] (+ (sq (big a b)) (sq (big (min a b) c))))
