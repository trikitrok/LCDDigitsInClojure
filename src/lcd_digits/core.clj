(ns lcd-digits.core)

(defn display [n]
  (if (= n 1)
    (str "   \n"
         "  |\n"
         "  |\n")
    (str " _ \n"
         "  |\n"
         "  |\n")))
