(ns lcd-digits.core)

(defn- first-row [n]
  (if (or (= n 1) (= n 4))
    "   \n"
    " _ \n"))

(defn- second-row [n]
  (cond 
    (= n 4) "|_|\n"
    (= n 0) "| |\n"
    :else "  |\n"))

(defn- third-row [n]
  (if (= n 0)
    "|_|\n"
    "  |\n"))

(defn display [n]
  (str 
    (first-row n)
    (second-row n)
    (third-row n)))
