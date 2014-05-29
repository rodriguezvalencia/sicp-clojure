(defn zero []
  (fn [f] (fn [x] x)))

(defn add-1 [n]
  (fn [f] (fn [x] (f ((n f) x)))))

(defn one []
  (fn [f] (fn [x] (f x))))

(defn two []
  (fn [f] (fn [x] (f (f x)))))

(defn three []
  (fn [f] (fn [x] (f (f (f x))))))

(defn add [a b]
  (fn [f] (fn [x] (((a) f) (((b) f) x)) )))

(((one) inc) 0)

(((add three two) inc) 0)

(defn pow [a b]
  (fn [f] (fn [x]
            (((b) (a)) x))))