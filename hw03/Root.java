////////////////////////////////
//Nelson Westwood
//Root Java Program
//
// Use a scanner to a number to calculate a cubic root
// Guess an estimate for the square root
// Repeat the process 4 times, improving with each guess

import java.util.Scanner; //import the scanner
public class Root {
    //main method for every java program
    public static void main (String[] args) {
    
        Scanner myScanner; //initiate the scanner
        myScanner = new Scanner(System.in); //give the scanner a value :)
        System.out.print("Enter a double, and I print its cube root "); //kindly ask for a double from the big User
        double X = myScanner.nextInt(); //set next int equal to x
        
        double guess = X/3; //make a terrible attempt at guessing the cube root
        guess = (guess*guess*guess+X)/(3*guess*guess); //continued atrocious tries at cube root solutions
        guess = (guess*guess*guess+X)/(3*guess*guess); //continued atrocious tries at cube root solutions
        guess = (guess*guess*guess+X)/(3*guess*guess); //continued atrocious tries at cube root solutions
        guess = (2*guess*guess*guess+X)/(3*guess*guess); //continued atrocious tries at cube root solutions
        System.out.println("The cube root is " + guess); //print the cube root
    }
}