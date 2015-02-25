////////////////////////////////
//Nelson Westwood
//Arthimetic Java Program
//
//Give the user a random number between 1000-5000
//Give the option to withdraw or deposit money
//Display the user's bank balance

import java.util.Scanner; 

public class Banking {
    
    public static void main (String[] args) {
        
        int deposit = 0;
        int withdraw = 0;
        int iBalance = (int) (Math.random() * 4000) + 1000;
        System.out.print("Would you like to deposit, withdraw, or view balance (d,w,vb) ");
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        String action = myScanner.next();
        
        switch (action) {
            case "d": System.out.print("How much would you like to deposit ");
            deposit = myScanner.nextInt();
            if (deposit > 0) {
                System.out.println("Your balance is " + (deposit + iBalance));
            }
            else {
                System.out.println("You cannot deposit negative cash"); //seriously figure it out mate
            }
            break;
            case "w": System.out.print("How much would you like to withdraw ");
            withdraw = myScanner.nextInt();
            if (withdraw > 0){
                if (withdraw < iBalance) {
                    System.out.println("Your balance is " + (iBalance - withdraw));
                }
                else {
                    System.out.println("You cannot withdraw more than your balance");
                }
            }
                else {
                System.out.println("You cannot withdraw negative cash"); //like cmon mate
                }
            break;
            case "vb": System.out.println("Your balance is " + iBalance);
            break;
        }
        double z = 3.0, y = 2.4;
        int x = 2;
        
        z = x+y;
        x=z;
        z -= x+y;
        
    }
}