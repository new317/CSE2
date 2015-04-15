//Nelson Westwood
//CSE2 Linear Java Program
//
// array stuff

import java.util.Scanner;
import java.util.Random;

public class CSE2Linear {
    public static void main (String [] args){
        int grade = 0;
        int arraySize = 15;
        int [] array;
        array = new int [arraySize];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 15 ints for the final grades in CSE2: ");
        for (int i = 0; i<15; i++){
            if (!scan.hasNextInt()) {
                System.out.println("You must enter an integer");
                scan.next();
                i--;
                continue;
            }
            grade = scan.nextInt();
            if (grade > 100 || grade < 0)  {
                System.out.println("You must enter a number b/w 0-100");
                i--;
                continue;
            }
            if (i == 0){
            array[i] = grade;
        }
        else if (array[i-1] > grade){
            System.out.println("You must enter in ascending order");
            i--;
            continue;
        }
        else {
            array[i] = grade;
        }
        }
        System.out.print("The grades, sorted, are: " );
        for (int j = 0; j<15; j++){
            System.out.print(" " + array[j] );
        }
        System.out.println("");
        System.out.print("Enter a grade to search for: "  );
        int gradeSearch = scan.nextInt();
        Search(array, gradeSearch);
        Random(array);
        System.out.println("");
        System.out.print("Enter a grade to search for: "  );
        int ngradeSearch = scan.nextInt();
        Linear(array, ngradeSearch);
    }
    public static void Search (int [] array, int gradeSearch){
        int high = array.length - 1;
        int low = 0;
        int mid = (high + low)/2;
        boolean found = false;
        
        int val = gradeSearch;
        int counter = 0;
        
        while ((high - low) !=0){
            counter++;
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
            System.out.println(gradeSearch + " was found in the list with " + counter + " iterations ");
        }
        else {
            System.out.println(gradeSearch + " was not found in the list with " + counter + " iterations ");
            
        }
    }
    
    public static void Random (int [] array){
        for (int i = 0; i < array.length; i++){
            int target = (int) (array.length * Math.random() );
            
            int temp = array[target];
            array[target] = array[i];
            array[i] = temp;
        }
        System.out.print("Scrambled: " );
        for (int j = 0; j<15; j++){
            System.out.print(" " + array[j] );
        }
    }
    public static void Linear (int [] array, int ngradeSearch){
        int counter = 0;
        boolean found = false;
        for (int i = 0; i < array.length; i++){
            if (array[i] == ngradeSearch){
                found = true;
                counter = i+1;
                break;
            }
        }
        if (found){
            System.out.println(ngradeSearch + " was found in the list with " + counter + " iterations ");
        }
        else {
            System.out.println(ngradeSearch + " was not found in the list with " + counter + " iterations ");
            
        }
    }
}