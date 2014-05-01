(defn hf [a b n] (/ (- b a) n))



(defn sum [term a next b]
  (if (> a b)
    0
    (+ (term a)
      (sum term (next a) next b))))

(defn simp [f a b n]
  (let [h (hf a b n)]
    (defn y [k] (f (+ a (* k h))))
    (* (/ h 3) (+ (y 0)
                   (* 2 (sum y 2 #(+ % 2) (- n 2)))
                   (* 4 (sum y 1 #(+ % 2) (- n 1)))
                   (y n)
                  )
        )
    )
  )

(simp #(* % % %) 0 1 100)
