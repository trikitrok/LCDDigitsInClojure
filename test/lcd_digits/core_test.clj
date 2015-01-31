(ns lcd-digits.core-test
  (:use midje.sweet)
  (:use [lcd-digits.core]))

(facts 
  "about LCD digits"
  
  (fact 
    "1 is displayed"
    (display 1) => (str "   \n"
                        "  |\n"
                        "  |\n"))
  (fact 
    "7 is displayed"
    (display 7) => (str " _ \n"
                        "  |\n"
                        "  |\n"))
  (fact 
    "4 is displayed"
    (display 4) => (str "   \n"
                        "|_|\n"
                        "  |\n"))
  (fact 
    "0 is displayed"
    (display 0) => (str " _ \n"
                        "| |\n"
                        "|_|\n"))
  (fact 
    "5 is displayed"
    (display 5) => (str " _ \n"
                        "|_ \n"
                        " _|\n"))
  (fact 
    "2 is displayed"
    (display 2) => (str " _ \n"
                        " _|\n"
                        "|_ \n"))
  (fact 
    "9 is displayed"
    (display 9) => (str " _ \n"
                        "|_|\n"
                        "  |\n"))
  (fact 
    "6 is displayed"
    (display 6) => (str " _ \n"
                        "|_ \n"
                        "|_|\n")))
