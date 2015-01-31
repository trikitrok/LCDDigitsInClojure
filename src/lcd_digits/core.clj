(ns lcd-digits.core)

(defn- first-row [n]
  (if (or (= n 1) (= n 4))
    "   \n"
    " _ \n"))

(defn- second-row [n]
  (cond 
    (or (= n 8) (= n 9) (= n 4)) "|_|\n"
    (= n 0) "| |\n"
    (or (= n 5) (= n 6)) "|_ \n"
    (or (= n 2) (= n 3)) " _|\n"
    :else "  |\n"))

(defn- third-row [n]
  (cond 
    (or (= n 8) (= n 0) (= n 6)) "|_|\n"
    (or (= n 5) (= n 3)) " _|\n"
    (= n 2) "|_ \n"
    :else "  |\n"))

(defn display [n]
  (str 
    (first-row n)
    (second-row n)
    (third-row n)))
