//Nelson Westwood
//Array Inputs Java Program
//
// array stuff

import java.util.Scanner;

public class ArrayInputs{
    public static void main (String [] args){
        Scanner scan=new Scanner(System.in);
        int arraySize = 0;
        int [] array;
        System.out.print("Please enter an integer for the of an array ");
        arraySize = scan.nextInt();
        while (arraySize <= 0){
            System.out.print("You must enter a positive integer ");
            arraySize = scan.nextInt();
        }
        array = new int [arraySize];
       
        System.out.print("Please enter a positive integer ");
        boolean firstNum = scan.hasNextInt();
        Check(firstNum);
        scan.next();
        System.out.println("Please enter " + arraySize + " positive integers");
        for (int i = 0; i<arraySize; i++){
            array[i] = scan.nextInt();
        }
        System.out.println("The array is ");
        for (int j = 0; j<arraySize; j++){
            System.out.println(array[j]);
        }
    }
    public static void Check (boolean firstNum){
        Scanner scan = new Scanner(System.in);
        if (firstNum!= true){
            System.out.print("The number you entered is not an integer ");
            firstNum = scan.hasNextInt();
        }
        int checkNum = scan.nextInt();
        if (checkNum <= 0){
            System.out.println("You gotta enter a positive integer ");
        }
    }
}
