//Nelson Westwood
//Multiply Java Program
//
// array multiplication stuff

import java.util.Scanner;
import java.util.Random;

public class Multiply {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        int width1 = 0;
        int length1 = 0;
        int width2 = 0;
        int length2 = 0;
        System.out.print("Enter the width of the first array ");
        for (int i = 0; i<1; i++){
            if (!scan.hasNextInt()) {
                System.out.print("You must enter an integer ");
                scan.next();
                i--;
                continue;
            }
            width1 = scan.nextInt();
            if (width1 <= 0)  {
                System.out.print("You must enter a number greater than 0 ");
                i--;
                continue;
            }
        }
        System.out.print("Enter the length of the first array ");
        for (int i = 0; i<1; i++){
            if (!scan.hasNextInt()) {
                System.out.print("You must enter an integer ");
                scan.next();
                i--;
                continue;
            }
            length1 = scan.nextInt();
            if (length1 <= 0)  {
                System.out.print("You must enter a number greater than 0 ");
                i--;
                continue;
            }
        }
        System.out.print("Enter the width of the second array ");
        for (int i = 0; i<1; i++){
            if (!scan.hasNextInt()) {
                System.out.println("You must enter an integer ");
                scan.next();
                i--;
                continue;
            }
            width2 = scan.nextInt();
            if (width2 <= 0)  {
                System.out.print("You must enter a number greater than 0 ");
                i--;
                continue;
            }
            if (width2 != length1){
                System.out.println("Array multplication won't work, enter another value (preferably the same as the first length)");
                i--;
                continue;
                
            }
        }
        System.out.print("Enter the length of the second array ");
        for (int i = 0; i<1; i++){
            if (!scan.hasNextInt()) {
                System.out.print("You must enter an integer ");
                scan.next();
                i--;
                continue;
            }
            length2 = scan.nextInt();
            if (length2 <= 0)  {
                System.out.print("You must enter a number greater than 0 ");
                i--;
                continue;
            }
            if (width1 != length2){
                System.out.println("Array multiplication won't work, enter another value (preferably the same as the first width) ");;
                i--;
                continue;
            }
        }
        int [][] array1 = randomMatrix(width1, length1);
        int [][] array2 = randomMatrix(width2, length2);
        System.out.println("Array1: ");
        printMatrix(array1);
        System.out.println("=====================");
        System.out.println("Array2: ");
        printMatrix(array2);
        int [][] array3 = matrixMultiply(array1, array2);
        System.out.println("=====================");
        System.out.println("The multiplied matrix: ");
        printMatrix(array3);
    }
    
    public static int [][] randomMatrix (int width, int length){
        int [][] array = new int [width][length];
         for (int i=0; i<width; i++){
            for (int j = 0; j<length; j++){
                array[i][j] = (int) ((Math.random() * 21) - 10);
            }
        }
        return array;
    }
    
    public static void printMatrix (int [][] array){
        for (int i = 0; i<array.length; i++){
            for (int j = 0; j<array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    }
    
    public static int [][] matrixMultiply (int [][] array1, int [][] array2){
        int [][] array3 = new int [array2[0].length][array1.length];
        for (int i = 0; i<array2[i].length; i++){
            for (int j = 0; j<array1.length; j++){
                array3[i][j] = 0;
            }
        }
        for(int i = 0; i<array1.length; i++){
            for (int j = 0; j<array2[0].length; j++){
                for (int k = 0; k<array1[0].length; k++){
                array3[i][j] += array1[i][k] * array2[k][j];  
            }
        }
        }
    return array3;
}
}
