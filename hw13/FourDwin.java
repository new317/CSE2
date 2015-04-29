//Nelson Westwood
//Multiply Java Program
//
// 4D arrays stuff

import java.util.Scanner;
import java.util.Random;

public class FourDwin {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        Random randomGen = new Random();
        int x, y;
        System.out.print("Enter an integer X: ");
        while(true){
            if(scan.hasNextInt()){
                x = scan.nextInt();
                if (x>0){
                break;
                }
                else{
                System.out.println("Invalid Input");
                }
            }
            else{System.out.println("Invalid Input");}
        scan.next();
        }
        System.out.print("Enter an integer Y where Y > X: ");
        while (true){
            if (scan.hasNextInt()){
                y = scan.nextInt();
            if (y>x){
                System.out.println("");
                break;
            }
            else{System.out.println("Invalid Input");}
            }
            else{System.out.println("Invalid Input");}
            scan.next();
        }
        
        int size = 3; 
        double [][][][] array = new double [size][][][];
         for (int i = 0; i < array.length; i++) {
            array[i] = new double[(int) randomGen.nextInt(y) + x][][];
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = new double[(int) randomGen.nextInt(y) + x][];
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    array[i][j][k] = new double[(int) randomGen.nextInt(y) + x];
                }
            }
        }
        for (int i = 0; i<size; i++){
            for (int j = 0; j<array[i].length; j++){
                for (int k = 0; k<array[i][j].length; k++){
                    for (int w = 0; w<array[i][j][k].length; w++){
                        double num = (Math.random()*31)*10;
                        num = Math.round(num);
                        num = num/10;
                        array[i][j][k][w] = num;
                    }
                }
            }
        }
        System.out.println("Original Array: ");
        printArray(array);
        System.out.println("Sorted Array: ");
        for (int i = 0; i<array.length; i++){
            array[i] = sort3DArray(array[i]);
        }
        sort4DArray(array);
        System.out.println("Statistics: ");
        statArray(array); 
    }
   public static void printArray(double array[][][][]) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print("{");
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i][j].length; k++) {
                    System.out.print("{{");
                    for (int l = 0; l < array[i][j][k].length; l++) {
                        System.out.print(array[i][j][k][l]+" ");
                    }
                    System.out.print("}}");
                }
            }
            System.out.print("} ");
        }
        System.out.println("}");
    }
 public static double[][][][] sort4DArray(double array[][][][]) {
        int temp = 0;
        int val = 0;
        for (int i = 0; i < array.length-1; i++) {
            temp = array[i].length;
            for (int j = i - 1; j >= 0; j--) {
                if (temp < array[i].length) {
                    array[j + 1] = array[j];
                    val = j;
                }
                else if (temp == array[i].length && min(array[i]) < min(array[j])) {
                    array[j + 1] = array[j];
                    val = j;
                }
                else {
                    val = j;
                    break;
                }
            }
            array[val + 1] = array[i];
        }
        return array;
    }
public static int min(double array[][][]) {
        int min = array[0].length;
        for (int i = 0; i < array.length-1; i++) {
            if (array[i].length < min) {
                min = array[i].length;
            }
        }
        return min;
    }
public static double[][][] sort3DArray(double array[][][]) {
        int min = 0;
        int val = 0;
        double[][] temp;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array[i].length-1; j++) {
                min = array[i].length;
                if (array[j].length < min) {
                    min = array[j].length;
                    val = j;
                }
            }
            temp = array[i];
            array[i] = array[val];
            array[val] = temp;
        }
        return array;
    }
 public static void statArray(double array[][][][]) {
        double sum = 0;
        double mean = 0;
        int elements = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; i < array[i].length; j++) {
                for (int k = 0; i < array[i][j].length; k++) {
                    for (int w = 0; i < array[i][j][k].length; w++) {
                        sum += array[i][j][k][w];
                        elements++;
                    }
                }
            }
        }
        mean = (int) (sum/elements) * 10;
        mean = (double) mean/10;
        System.out.println("Members: " + elements);
        System.out.println("Sum: " + sum);
        System.out.println("Mean: " + mean);
    }
}