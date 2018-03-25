(ns exercise2)

(defn only-greater-than-five
	[my-vector]
	(filter (fn[x]
		(> x 5)) my-vector))
			
	

