(ns lcd-digits.core)

(defn- first-row [n]
  (if (or (= n 1) (= n 4))
    "   \n"
    " _ \n"))

(defn display [n]
  (str (first-row n)
       (if (= n 4)
         "|_|\n"
         "  |\n")
       "  |\n"))

