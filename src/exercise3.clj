(ns exercise3)

(defn fibonacci
	[x]
  (cond
	(= x 0) 0
  (= x 1) 1
  (> x 1) (+ (fibonacci (- x 1)) (fibonacci (- x 2)))))
