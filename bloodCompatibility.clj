



;; (blood_test) takes in 2 blood types and determines 
;;    they are compatible or not
;; effects: produces output
(defn blood_test []
  ; Definitions
    (def compat "They are compatible!")
    (def not_compat "They are not compatible.")

  ; User information
    (println "What is the donor's blood type?")
    (def donor (read-line))
    (println "What is the recipient's blood type?")
    (def recipient (read-line))

  ; Body
    (cond 
      (or (= donor "O-") 
          (= donor recipient)
          (= recipient "AB+")) (println compat)
      (and (= donor "O+") 
           (or (= recipient "A+")
                (= recipient "B+"))) (println compat)
      (and (= donor "A-") 
           (or (= recipient "A+")
               (= recipient "AB-"))) (println compat)
      (and (= donor "B-") 
           (or (= recipient "B+")
                (= recipient "AB-"))) (println compat)
      :else (println not_compat))
  )







