////////////////////////////////
//Nelson Westwood
//To Hex Java Program
//
// Use a scanner to prompt user for a 3 numbers represented in RGB 0-255
// Convert these numbers into the hexidecimal system.

import java.util.Scanner;
public class ToHex {
    public static void main (String [] arg) {
        Scanner myScanner; //initiate the scanner
        myScanner = new Scanner(System.in); //give the scanner a value
        System.out.print("Please enter three numbers representing RGB values ");
        int firstRGB = myScanner.nextInt(); // intialize the scanner's first int
        int secondRGB = myScanner.nextInt(); // next int
        int thirdRGB = myScanner.nextInt(); // third int
        int firstHex = 0; //give initial values for if statements
        int secondHex = 0; //refer to above comment
        int thirdHex = 0; //refer above
        int fourthHex = 0; //refer above
        int fifthHex = 0; //refer above
        int sixthHex = 0; //refer above
        String string = ""; //give initial string value
        String string2 = ""; //same as before
        String string3 = ""; //same as before 
        String string4 = ""; //same as before
        String string5 = ""; //same as before
        String string6 = ""; //same as before
        
        
        if (firstRGB >= 0 && firstRGB <= 255){ //need an int between these two vals
           if (secondRGB >= 0 && firstRGB <= 255){ //same as above
               if (thirdRGB >= 0 && firstRGB <= 255){ //same as above
                   firstHex = firstRGB/16;
                   secondHex = firstRGB%16;
                   thirdHex = secondRGB/16;
                   fourthHex = secondRGB%16;
                   fifthHex = thirdRGB/16;
                   sixthHex = thirdRGB%16;
                   
                   switch (firstHex) {
                       case 10: string += "A"; //set the first case and convert the integer 10 to the hexidecimal A. The same will be done for all subsequent switch statements where the number larger than 9 is converted to its hexidecimal equivalent. This will occur for each different RGB value. I don't feel the need to comment on every single one of these. 
                           break;
                       case 11: string += "B";
                       break;
                       case 12: string += "C";
                       break;
                       case 13: string += "D";
                       break;
                       case 14: string += "E";
                       break;
                       case 15: string += "F";
                       break;
                       default:
                       string += firstHex; //if the number isn't greater than 9, then the hexidecimal will be the same as the decimal value. Same default for all switch statements. 
                       break;
                   }
                    switch (secondHex) {
                       case 10: string2 += "A";
                           break;
                       case 11: string2 += "B";
                       break;
                       case 12: string2 += "C";
                       break;
                       case 13: string2 += "D";
                       break;
                       case 14: string2 += "E";
                       break;
                       case 15: string2 += "F";
                       break;
                       default:
                       string2 += secondHex;
                       break;
                    }
                       switch (thirdHex) {
                       case 10: string3 += "A";
                           break;
                       case 11: string3 += "B";
                       break;
                       case 12: string3 += "C";
                       break;
                       case 13: string3 += "D";
                       break;
                       case 14: string3 += "E";
                       break;
                       case 15: string3 += "F";
                       break;
                       default:
                       string3 += thirdHex;
                       break;
                       }
                       switch (fourthHex) {
                       case 10: string4 += "A";
                           break;
                       case 11: string4 += "B";
                       break;
                       case 12: string4 += "C";
                       break;
                       case 13: string4 += "D";
                       break;
                       case 14: string4 += "E";
                       break;
                       case 15: string4 += "F";
                       break;
                       default:
                       string4 += fourthHex;
                       break;
                       }
                       switch (fifthHex) {
                        case 10: string5 += "A";
                           break;
                       case 11: string5 += "B";
                       break;
                       case 12: string5 += "C";
                       break;
                       case 13: string5 += "D";
                       break;
                       case 14: string5 += "E";
                       break;
                       case 15: string5 += "F";
                       break;
                       default:
                       string5 += fifthHex;
                       break;
                       }
                        switch (sixthHex) {
                       case 10: string6 += "A";
                           System.out.println("The decimal numbers R: " + firstRGB + " G: " + secondRGB + " B: " + thirdRGB + " are represented in hexidecimal as " + string + string2 + string3 + string4 + string5 + string6);
                           break;
                       case 11: string6 += "B";
                       System.out.println("The decimal numbers R: " + firstRGB + " G: " + secondRGB + " B: " + thirdRGB + " are represented in hexidecimal as " + string + string2 + string3 + string4 + string5 + string6);
                       break;
                       case 12: string6 += "C";
                       System.out.println("The decimal numbers R: " + firstRGB + " G: " + secondRGB + " B: " + thirdRGB + " are represented in hexidecimal as " + string + string2 + string3 + string4 + string5 + string6);
                       break;
                       case 13: string6 += "D";
                       System.out.println("The decimal numbers R: " + firstRGB + " G: " + secondRGB + " B: " + thirdRGB + " are represented in hexidecimal as " + string + string2 + string3 + string4 + string5 + string6);
                       break;
                       case 14: string6 += "E";
                      System.out.println("The decimal numbers R: " + firstRGB + " G: " + secondRGB + " B: " + thirdRGB + " are represented in hexidecimal as " + string + string2 + string3 + string4 + string5 + string6);
                       break;
                       case 15: string6 += "F";
                        System.out.println("The decimal numbers R: " + firstRGB + " G: " + secondRGB + " B: " + thirdRGB + " are represented in hexidecimal as " + string + string2 + string3 + string4 + string5 + string6);
                       default:
                       string6 += sixthHex;
                       System.out.println("The decimal numbers R: " + firstRGB + " G: " + secondRGB + " B: " + thirdRGB + " are represented in hexidecimal as " + string + string2 + string3 + string4 + string5 + string6);
                       break;
                        }
                       
               }
               else {
                   System.out.println("Bad input"); //if int is less than 0 or greater than 255, its considered a bad value
               }
           }
           else {
               System.out.println("Bad input"); //if int is less than 0 or greater than 255, its considered a bad value
           }
        }
        else{
            System.out.println("Bad input"); //if int is less than 0 or greater than 255, its considered a bad value
        }
}
}
                       
                       
                       
                   
                   
               
           
        
    

      