(:use ["2_7.clj"])

(defn par1 [r1 r2]
  (div-interval (mul-interval r1 r2)
    (add-interval r1 r2)))

(defn par2 [r1 r2]
  (let [one (make-interval 1 1)]
    (div-interval one
      (add-interval (div-interval one r1)
        (div-interval one r2)))))

(def tal (make-center-percent 10 20))

(def til (make-center-percent 3 14))