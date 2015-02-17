////////////////////////////////
//Nelson Westwood
//Arthimetic Java Program
//
//Make a program that guesses a number from 1-10
//Use a series of ifs, booleans and other to wittle down the possible numbers

import java.util.Scanner;

public class WhichNumber {
    
    public static void main (String[] args){
        
        System.out.println("Think of a number between 1-10 inclusive");
        Scanner myScanner; //initiate the scanner
        myScanner = new Scanner(System.in);
        
        System.out.print("Is your number even? ");
        String even = myScanner.next();
        String by3 = "";
        String its6 = "";
        String by4 = "";
        String dividedby4 = "";
        String its8 = "";
        String its4 = "";
        String its10 = "";
        String by5 = "";
        String its2 ="";
        String dividedby3 ="";
        String its9 ="";
        String big6 = "";
        String its7 = "";
        String less3 = "";
        String its1 ="";
        String its5 ="";
        String its3 = "";
        if(even.equals("y")||even.equals("Y")||even.equals("n")||even.equals("N")) {
            if (even.equals("y")||even.equals("Y")) { 
                System.out.print("Is is divisible by 3? ");
                 by3 = myScanner.next();
                 if(by3.equals("y")||by3.equals("Y")||by3.equals("n")||by3.equals("N")) {
                     if (by3.equals("y")||by3.equals("Y")){
                         System.out.print("Is your number 6?");
                          its6 = myScanner.next();
                          if(its6.equals("y")||its6.equals("Y")||its6.equals("n")||its6.equals("N")) {
                              if(its6.equals("y")||its6.equals("Y")) {
                                  System.out.println("YAAAAAAAAAAAAAAAAAAY!"); //this is a Russian accent 
                              }
                              else {
                                  System.out.println("You're a filthy liar"); //its true
                              }
                          }
                          else {
                              System.out.println("Improper input"); //sigh
                          }
                     }
                     else {
                         System.out.print("Is your number divisible by 4?");
                         by4 = myScanner.next();
                         if(by4.equals("y")||by4.equals("Y")||by4.equals("n")||by4.equals("N")) { 
                             if(by4.equals("y")||by4.equals("Y")) {
                                 System.out.print("Is the number divided by 4 greater than 1?");
                                 dividedby4 = myScanner.next();
                                  if(dividedby4.equals("y")||dividedby4.equals("Y")||dividedby4.equals("n")||dividedby4.equals("N")) {
                                      if(dividedby4.equals("y")||dividedby4.equals("Y")){
                                          System.out.println("Is your number 8?");
                                          its8 = myScanner.next();
                                           if(its8.equals("y")||its8.equals("Y")||its8.equals("n")||its8.equals("N")) {
                                               if(its8.equals("y")||its8.equals("Y")){
                                               System.out.println("YAAAAAAAAAAAAAAAAAAY!"); //spice it up and pick your own accent
                                           }
                                           else {
                                               System.out.println("You're a filthy liar"); //why must you lie
                                           }
                                      }
                                      else {
                                          System.out.println("Improper input");
                                      }
                                      }
                                      else {
                                          System.out.print("Is your number 4?");
                                          its4 = myScanner.next();
                                          if(its4.equals("y")||its4.equals("Y")||its4.equals("n")||its4.equals("N")) {
                                              if(its4.equals("y")||its4.equals("Y")) {
                                                  System.out.println("YAAAAY!"); //I'm way less excited now
                                              }
                                              else {
                                                  System.out.println("I'm getting real sick of your lies"); //I don't think this relationship is going to work out
                                              }
                                          }
                                          else {
                                              System.out.println("Improper input"); 
                                          }
                                      }
                                  }
                                  else {
                                      System.out.println("Improper input");
                                  }
                                  }
                                  else {
                                      System.out.print("Is it divisible by 5?");
                                      by5 = myScanner.next();
                                       if(by5.equals("y")||by5.equals("Y")||by5.equals("n")||by5.equals("N")) {
                                           if(by5.equals("y")||by5.equals("Y")){
                                           System.out.print("Is your number 10?");
                                           its10 = myScanner.next();
                                            if(its10.equals("y")||its10.equals("Y")||its10.equals("n")||its10.equals("N")) {
                                                if(its10.equals("y")||its10.equals("Y")){
                                                System.out.println("Yay"); //I'm devoid of all emotions now
                                                }
                                                    else {
                                                        System.out.println("Stop lying");
                                                    }
                                            }
                                            else {
                                                System.out.println("Improper input");
                                            }
                                            }
                                            else {
                                                System.out.print("Is your number 2?");
                                                its2 = myScanner.next();
                                                 if(its2.equals("y")||its2.equals("Y")||its2.equals("n")||its2.equals("N")) {
                                                     if(its2.equals("y")||its2.equals("Y")){
                                                         System.out.println("yay"); //beep beep bop
                                                     }
                                                     else {
                                                         System.out.println("Stop lying");
                                                     }
                                                 }
                                                 else {
                                                     System.out.println("Improper Input");
                                                 }
                                            }
                                       }
                                       else {
                                           System.out.println("Improper Input");
                                       }
                                  }
                         }
                         else { 
                             System.out.println("Improper Input");
                         }
                     }
                 }
                 else {
                     System.out.println("Improper Input");
                 }
            }
            else {
                System.out.print("Is it divisible by 3?");
                by3 = myScanner.next();
                 if(by3.equals("y")||by3.equals("Y")||by3.equals("n")||by3.equals("N")) {
                     if(by3.equals("y")||by3.equals("Y")){
                         System.out.print("When divided by 3 is the result greather than 1?");
                         dividedby3 = myScanner.next();
                          if(dividedby3.equals("y")||dividedby3.equals("Y")||dividedby3.equals("n")||dividedby3.equals("N")) {
                              if(dividedby3.equals("y")||dividedby3.equals("Y")){
                                  System.out.print("Is your number 9?");
                                  its9 = myScanner.next();
                                  if(its9.equals("y")||its9.equals("Y")||its9.equals("n")||its9.equals("N")) {
                                      if(its9.equals("y")||its9.equals("Y")){
                                          System.out.println("yay");
                                      }
                                      else {
                                          System.out.print("More lies");
                                      }
                                  }
                                  else {
                                      System.out.println("Improper input");
                                  }
                              }
                              else { 
                                  System.out.print("Is your number 3?");
                                  its3 = myScanner.next();
                                   if(its3.equals("y")||its3.equals("Y")||its3.equals("n")||its3.equals("N")) {
                                       if(its3.equals("y")||its3.equals("Y")){
                                           System.out.println("yay");
                                       }
                                       else {
                                           System.out.println("Stop the nonsensical lying");
                                       }
                                   }
                                   else {
                                       System.out.println("Improper input");
                                   }
                              }
                          }
                          else {
                              System.out.println("Improper input");
                          }
                     }
                              else {
                                  System.out.print("Is your number greater than 6?");
                                  big6 = myScanner.next();
                                  if(big6.equals("y")||big6.equals("Y")||big6.equals("n")||big6.equals("N")) {
                                      if(big6.equals("y")||big6.equals("Y")){
                                          System.out.print("Is your number 7?");
                                          its7 = myScanner.next();
                                          if(its7.equals("y")||its7.equals("Y")||its7.equals("n")||its7.equals("N")) {
                                              if(its7.equals("y")||its7.equals("Y")){
                                                  System.out.println("yay");
                                              }
                                              else {
                                                  System.out.println("You might have a lying problem");
                                              }
                                          }
                                          else {
                                              System.out.println("Improper Input");
                                          }
                                      }
                                      else {
                                          System.out.print("Is your number less than 3?");
                                          less3 = myScanner.next();
                                          if(less3.equals("y")||less3.equals("Y")||less3.equals("n")||less3.equals("N")) {
                                              if(less3.equals("y")||less3.equals("Y")){
                                                  System.out.print("Is your number 1? ");
                                                  its1 = myScanner.next();
                                                  if(its1.equals("y")||its1.equals("Y")||its1.equals("n")||its1.equals("N")) {
                                                      if(its1.equals("y")||its1.equals("Y")){
                                                      System.out.println("yay"); 
                                                      }
                                                      else {
                                                          System.out.println("You're lying");
                                                      }
                                                  }
                                                  else {
                                                      System.out.println("Improper Input");
                                                  }
                                              }
                                              else {
                                                  System.out.print("Is your number 5? ");
                                                  its5 = myScanner.next();
                                                   if(its5.equals("y")||its5.equals("Y")||its5.equals("n")||its5.equals("N")) {
                                                       if(its5.equals("y")||its5.equals("Y")){
                                                           System.out.println("yay");
                                                       }
                                                       else {
                                                           System.out.println("Back at your disgusting lies I see");
                                                       }
                                                   }
                                                   else {
                                                       System.out.println("Improper input");
                                                   }
                                              }
                                          }
                                          else {
                                                System.out.println("Improper input");
                                          }
                                      }
                                  }
                                  else {
                                      System.out.println("Improper Input");
                                  }
                              }
                 }
                 else {
                     System.out.println("Improper Input");
                 }
            }
            
        }
        else {
            System.out.println("Improper input");
        }
    }
}
        
                                            
                                                  