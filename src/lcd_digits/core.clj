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

(defn- digits-in [n]
  (map #(Integer/parseInt (str %)) (str n)))

(defn display [n]
  (str 
    (clojure.string/join " " (map first-row (digits-in n)))
    "\n"
    (clojure.string/join " " (map second-row (digits-in n)))
    "\n"
    (clojure.string/join " " (map third-row (digits-in n)))
    "\n"))
