(ns lcd-digits.core-test
  (:use midje.sweet)
  (:use [lcd-digits.core]))

(facts 
  "about LCD digits"
  
  (display 1) => (str "   \n"
                      "  |\n"
                      "  |\n")
  
  (display 7) => (str " _ \n"
                      "  |\n"
                      "  |\n")
  
  (display 4) => (str "   \n"
                      "|_|\n"
                      "  |\n"))
