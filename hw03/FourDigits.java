////////////////////////////////
//Nelson Westwood
//Root Java Program
//
// Use a scanner to prompt user for a number
// Print the last 4 decimals of that number

import java.util.Scanner;

public class FourDigits {
    //main method for every java program
    public static void main (String[] args) {
    
        Scanner myScanner; //initiate the scanner
        myScanner = new Scanner(System.in); //give the scanner a value ;)
        System.out.print("Enter a double and I display the four digits to the right "); //read and weep
        double X = myScanner.nextDouble(); //set the double equal to the value
        X = (int) (X*10000); //multiply and divide
        int FourDigits = (int) X %10000; //ja feel mods
        
        System.out.printf("%04d \n",FourDigits ); //print the digits
    }
}
        