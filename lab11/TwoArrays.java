//Nelson Westwood
//Lab 11 
//
// array stuff

import java.util.Random;
import java.util.Scanner;

public class TwoArrays {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        int size = 50;
        int [] array1 = new int [size];
        int [] array2 = new int [size];
        for (int i = 0; i < array1.length; i++){
            array1[i] = (int) (Math.random() * 100);
        }
        Linear(array1);
        int value = (int) (Math.random() * 100);
        for (int j = 0; j < array2.length; j++){
            array2[j] = value += (int) (Math.random() * 100);
        }
        Linear(array2);
        System.out.print("Enter an integer >= 0" + "");
        int searchVal = scan.nextInt();
        if (!scan.hasNextInt()){
            System.out.println("You didn't enter an integer");
        }
        if (searchVal <= 0){
            System.out.println("Please enter a value greater than 0");
            
        }
        Search(array2, searchVal);
    }
    public static void Linear (int [] array){
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
            if (array [i] > max){
                max = array[i];
            }
        }
        System.out.println("The maximum of array1 is: " + max + ".");
        System.out.println("The minimum of array1 is: " + min + ".");
}
public static void Search (int [] array, int gradeSearch){
        int high = array.length - 1;
        int low = 0;
        int mid = (high + low)/2;
        boolean found = false;
        
        int val = gradeSearch;
        
        while ((high - low) !=0){
            if (array[mid] == val){
                found = true;
                break;
            }
            else if (array[mid] > val){
                high = mid;
                mid = (high + low - 1)/2;
            }
            else{
                low = mid;
                mid = (high + low + 1)/2;
            }
        }
         if (found){
            System.out.println(gradeSearch + " was found in the list.");
        }
        else {
            System.out.println(gradeSearch + " was not found in the list.");
            System.out.println("The number above the key was " + array[mid+1]);
            System.out.println("The number below the key was " + array[mid-1]);
            
        }
}
}