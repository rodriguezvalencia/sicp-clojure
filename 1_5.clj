Normal order ev.  -> ends up being eager

(if (= 0 0)
      0
      (p))


(if (= 0 0)
      (0)
      p)

0

Applicative order ev.   -> ends up being lazily evaluating (p), so it doesnt
(if (= 0 0)
       0
       (p))

0
