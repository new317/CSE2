////////////////////////////////
//Nelson Westwood
//Arthimetic Java Program
//
//Enter the number of cookies
//Ask for the number of cookies at the party
//Enter the number of cookies each person needs
//Print out if you have enough and if the number will divide evenly

import java.util.Scanner;

public class Cookies {
    //main method required for every java program
    public static void main (String[] args) {
        
         Scanner myScanner; //initiate the scanner
         myScanner = new Scanner(System.in); //give the scanner a value
         System.out.print("Enter the number of people ");
         
         int people = 0;
         int nGet = 0;
         int nCookies = 0;
         if (myScanner.hasNextInt()){
             people = myScanner.nextInt();
         }
         else {
             System.out.println("You did not print an integer");
             return; //terminate the if statement
         }
       
         if (people > 0){
             System.out.print("Enter the number of cookies you are planning to buy ");
             nCookies = myScanner.nextInt();
         }
         else {
             System.out.println("You did not print an integer  > 0");
         }
        
         if (nCookies > 0){
             System.out.print("How many do you want each person to get? ");
             nGet = myScanner.nextInt();
         }
             else{
                 System.out.println("You can't have half a cookie you idiot ");
             }
         
             int nEnough = people*nGet;
             if (nEnough <= nCookies){
                 if(nCookies %nEnough == 0){
                 System.out.println("You have enough cookies for each person and the amount divides equally ");
             
                 }
                 else{
                     System.out.println("You have enough cookies for each person but it does not divide equally ");
                 }
            }
                else{ 
                    System.out.println("You don't have enough cookies ");
             }
         }
    }
