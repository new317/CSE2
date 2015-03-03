////////////////////////////////
//Nelson Westwood
//Get Integers Java Program
//
// Use non-nested for loops to sum five user inputed integers
// Test each inputed value to ensure that it is an integer and not anything else

import java.util.Scanner; //import the scanner
public class GetIntegers {
    // set-up the main class
public static void main (String [] args) {
    // set-up the main string
    Scanner myScanner; //initiate the scanner
    myScanner = new Scanner(System.in); //set the scanner equal to inputs
    
    int integer1; //initiate the variable
    int integer2; //initiate the variable
    int integer3; //initiate the variable
    int integer4; //initiate the variable
    int integer5; //initiate the variable
   
   for(;true;){ //set-up an infinite for loop 
       if(myScanner.hasNextInt()){ //make sure the next scanner value is an integer
           integer1 = myScanner.nextInt(); //if it is set-it equal to integer1
           if(integer1 < 0){ //make sure the integer is a non-negative
               System.out.println("Invalid Input, try again"); //if it is a negative, ask for another input
           }
           else{
               break; //if the integer is positive, break the if statement mate
           }
           
       }
       else{
           String trash = myScanner.next(); //if the input is not an int, set it equal to the string
           System.out.println("Invalid Input, try again"); //print if non-integer input appears
           
       }
       //the next four loops are the exact same as the first one, but for integers 2-5
   }
   for(;true;){
       if(myScanner.hasNextInt()){
           integer2 = myScanner.nextInt();
           if(integer2 < 0){
               System.out.println("Invalid Input, try again");
           }
           else{
               break;
           }
           
       }
       else{
           String trash1 = myScanner.next();
           System.out.println("Invalid Input, try again");
           
       }
   }for(;true;){
       if(myScanner.hasNextInt()){
           integer3 = myScanner.nextInt();
           if(integer3 < 0){
               System.out.println("Invalid Input, try again");
           }
           else{
               break;
           }
           
       }
       else{
           String trash2 = myScanner.next();
           System.out.println("Invalid Input, try again");
           
       }
   }for(;true;){
       if(myScanner.hasNextInt()){
           integer4 = myScanner.nextInt();
           if(integer4 < 0){
               System.out.println("Invalid Input, try again");
           }
           else{
               break;
           }
           
       }
       else{
           String trash3 = myScanner.next();
           System.out.println("Invalid Input, try again");
           
       }
   }for(;true;){
       if(myScanner.hasNextInt()){
           integer5 = myScanner.nextInt();
           if(integer5 < 0){
               System.out.println("Invalid Input, try again");
           }
           else{
               break;
           }
           
       }
       else{
           String trash4 = myScanner.next();
           System.out.println("Invalid Input, try again");
           
       }
   }
   
   int sum = (integer1 + integer2 + integer3 + integer4 + integer5); //sum the integers
    System.out.println("The sum is " + sum); //print the dang sum

}
}