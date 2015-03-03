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
    
    int factorial;
    int number;
    int total = 1;
    
    while (!myScanner.hasNextInt()) {
            System.out.println("Invalid Input, try again");
            String trash = myScanner.next();
        }
        
    while(myScanner.hasNextInt()) {
        number = myScanner.nextInt();
        factorial = number;
        if (number > 16 || number < 9) {
            System.out.println("Invalid Input, try again");
        }
        else {
            System.out.println("Input Accepted ");
            while (factorial > 0){
                total = total * factorial;
                factorial--;
            }
            System.out.println("The facortial " + number + "! = " + total);
            break;
        }
    }
    
}
}
            
            
    
    