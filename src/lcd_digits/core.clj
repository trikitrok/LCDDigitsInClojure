(ns lcd-digits.core)

(defn- first-row [n]
  (if (or (= n 1) (= n 4))
    "   "
    " _ "))

(defn- second-row [n]
  (cond 
    (or (= n 8) (= n 9) (= n 4)) "|_|"
    (= n 0) "| |"
    (or (= n 5) (= n 6)) "|_ "
    (or (= n 2) (= n 3)) " _|"
    :else "  |"))

(defn- third-row [n]
  (cond 
    (or (= n 8) (= n 0) (= n 6)) "|_|"
    (or (= n 5) (= n 3)) " _|"
    (= n 2) "|_ "
    :else "  |"))

(defn display [n]
  (str 
    (first-row n)
    "\n"
    (second-row n)
    "\n"
    (third-row n)
    "\n"))
