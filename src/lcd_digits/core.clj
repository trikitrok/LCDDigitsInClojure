(ns lcd-digits.core)

(defn- first-row [n]
  (if (= n 1)
    "   \n"
    " _ \n"))

(defn display [n]
  (str (first-row n)
       "  |\n"
       "  |\n"))

