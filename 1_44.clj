(load-file "1_43.clj")

(def dx 0.000001)

(defn avg [& params]
  (/ (reduce + params) (count params)))

(defn smooth [f]
  #(avg (f (- % dx)) (f %) (f (+ % dx))))

(defn n-smooth [f n]
  (repeated smooth n) f)