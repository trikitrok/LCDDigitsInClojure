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

(def ^:private fns-by-row
  {1 first-row
   2 second-row
   3 third-row})

(defn- display-row [row-num n]
  (str 
    (clojure.string/join " " (map (fns-by-row row-num) 
                                  (digits-in n)))
       "\n"))

(defn display [n]
  (str 
    (display-row 1 n)
    (display-row 2 n)
    (display-row 3 n)))
