////////////////////////////////
//Nelson Westwood
//Run Factorials Java Program
//
// Ask user for a number between 9 and 16
// Calc the factorial of that number

import java.util.Scanner; //import the scanner
public class RunFactorial {
    // set-up the main class
public static void main (String [] args) {
    // set-up the main string
    Scanner myScanner; //initiate the scanner
    myScanner = new Scanner(System.in); //set the scanner equal to inputs
    
    int factorial; //initiate variable
    int number; //initiate variable 
    int total = 1; //initiate variable 
    
    while (!myScanner.hasNextInt()) { //test the next input
            System.out.println("Invalid Input, try again"); //if it is not an integer print this statement
            String trash = myScanner.next(); //set the bad input equal to this variable 
        }
        
    while(myScanner.hasNextInt()) { //test next input
        number = myScanner.nextInt(); //if it is an integer, set it equal to number
        factorial = number; //set factorial equal to number
        if (number > 16 || number < 9) { //test to make sure number is between 9-16
            System.out.println("Invalid Input, try again"); //if not print this
        }
        else {
            System.out.println("Input Accepted "); //if it is between 9-16 print this
            while (factorial > 0){ //use to decrease factorial by 1 each team (factorial equation)
                total = total * factorial; //use the total as factorial equation
                factorial--; //decrement by 1 
            }
            System.out.println("The facortial " + number + "! = " + total); //print the factorial
            break; //break the while loop
        }
    }
    
}
}
            
            
    
    