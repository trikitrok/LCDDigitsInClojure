(ns lcd-digits.core-test
  (:use midje.sweet)
  (:use [lcd-digits.core]))

(facts 
  "about LCD digits"
  
  (display 1) => (str "   \n"
                      "  |\n"
                      "  |\n"))
