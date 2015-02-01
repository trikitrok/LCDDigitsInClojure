(ns lcd-digits.core
  (:require [clojure.string :refer [join]]))

(defn- digits-in [n]
  (map #(Integer/parseInt (str %)) (str n)))

(def ^:private fns-by-row
  {:first (fn [n]
            (if (or (= n 1) (= n 4))
              "   "
              " _ "))
   
   :second (fn [n]
             (cond 
               (or (= n 8) (= n 9) (= n 4)) "|_|"
               (= n 0) "| |"
               (or (= n 5) (= n 6)) "|_ "
               (or (= n 2) (= n 3)) " _|"
               :else "  |"))
   
   :third (fn [n]
            (cond 
              (or (= n 8) (= n 0) (= n 6)) "|_|"
              (or (= n 5) (= n 3)) " _|"
              (= n 2) "|_ "
              :else "  |"))})

(defn- row [row-num n]
  (str 
    (join 
      " " 
      (map (fns-by-row row-num) 
           (digits-in n)))
    "\n"))

(defn display [n]
  (str 
    (row :first n)
    (row :second n)
    (row :third n)))
