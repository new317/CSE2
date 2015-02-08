////////////////////////////////
//Nelson Westwood
//Bicycle Java Program
//
// Use a scanner to input the number of seconds and counts
// Enter the both numbers
// Calculate the mileage, time, and speed

import java.util.Scanner; //import the scanner

public class Bicycle {
    //main method for every java program
    public static void main (String[] args) {
    
        Scanner myScanner; //initiate the scanner
        myScanner = new Scanner(System.in); //give the scanner a value ya know? (Canadian accent)
        System.out.print(
            "Enter the number of seconds (an integer > 0): "); //prompt user input 
        int nTime = myScanner.nextInt(); //set the time equal to dat input
        
        System.out.print(
            "Enter the number of counts (an integer > 0): "); //give me dem counts (now Jamaican Accent) beer can
        int nCounts = myScanner.nextInt(); //set the counts equal to next int
        
        double Pi = 3.14;
        double WheelCircumferenece = 27*Pi; //wheel diameter is 27 inches times Pi for circumference
        double totalDistance = (nCounts * WheelCircumferenece)/63360; //calc da mileage
        totalDistance = (double) (int) (totalDistance *100)/100; //cast as an int boi
        double totalTime = nTime/60; //calc time in min
        double Speed = totalDistance/(totalTime/60); //calc mph
        Speed = (double) (int) (Speed*100)/100; //cast MOAR ints
        
        System.out.println("The distance was " + totalDistance + " miles" + " and took " + totalTime + " minutes"); //print the distance and time
        System.out.println("The average mph was " + Speed); //print dat speed
    }
    
}