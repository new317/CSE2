//Nelson Westwood
//Waves Java Program
//Create a wave of numbers using for, while, and do-while loops
//Print the waves out with those numbers bruh

import java.util.Scanner; //import da scanner
public class Waves {
    //public class 
    public static void main (String [] args){
        //dat main method boi
        Scanner myScanner; //import scanner 
        myScanner = new Scanner(System.in); //set the scanner 
        int number = -2; //intiliaze a number to get the program running
        String input; //string the input value, to be used at a later date
        
        System.out.println("Enter a number between 1 and 30 bruh"); //prompt the user
        while (number < 1 || number > 30){ //test the number range
            while (!myScanner.hasNextInt()){ //make sure the next input is an integer
                System.out.println("Improper input"); //if not print this
                myScanner.next(); //reset the scanner 
            }
            number = myScanner.nextInt(); //set number equal to the next integer input
            if (number >=1 && number <=30){ //test number range 1-30
                break;
            }
                else {
                    System.out.println("Invalid input, cmon bruh"); //if not b/w 1-30 print this
                }
            }
            System.out.println("For Loop: ");
            for (int counter = 1; counter <= number; counter++){ //initialize a wave counter, and as long as the counter is below the number given, add 1 to the counter
                if (counter%2 == 0){ //test if the counter is even
                    input = ""; //make the string hold nothing
                    for (int inputCounter = 1; inputCounter <= counter; inputCounter++){ //initialize a string counter, that is less than equal to the wave counter, and add 1 to it
                        input += counter; //add even numbers to the string for each loop
                        System.out.println(input); //print the string each time
                    }
                }
                else{
                    for (int inputCounter = counter; inputCounter>=1; inputCounter--){ //if odd, start the string counter at the wave counter, make sure the string counter is bigger than 1, then decrement
                        for (int length = 1; length <= inputCounter; length ++){ //initialize the length of the wave, make it less than or equal to the string counter, then increment it
                            System.out.print(counter); //print out the number
                        }
                        System.out.println(""); //print out a blank space to create wave format
                    }
                    
                }
            }
        System.out.println("While Loop: "); //start the while loop
        int counter = 1; //initialize the wave counter at 1
        while(counter <= number){ //make sure counter is less than or equal to the input number
            if (counter%2 == 0){ //test even
                input = ""; //empty string place holder
                int inputCounter = 1; //initialize string counter
                while (inputCounter <= counter){ //create wave format
                    inputCounter++; //increment to make 1 more string each time
                    input += counter; //add integer to the empty string
                    System.out.println(input); //print out that string
                    
                }
            }
            else{
                int inputCounter = counter; //initialize string counter
                while (inputCounter >=1){ //has to be greater than 1
                    int length = 1; //initialize the wave length
                    while (length <= inputCounter){ //wave length has to be less than or equal to wave counter
                        System.out.print(counter); //print out the number
                        length++; //increase length to make wave format
                    }
                    System.out.println(""); //blank line
                    inputCounter--; //decrement string counter to decrease the number of strings per line in the loop
                }
                }
                counter++; //increase the number of waves
            }
        System.out.println("Do while loop: "); //exact same thing as while loop, but put the while statements at the end and code after do statements
        counter = 1;
            do {
            if (counter%2 == 0){
                input = "";
                int inputCounter = 1;
                do{
                    inputCounter++;
                    input += counter;
                    System.out.println(input);
                    
                }while (inputCounter <= counter);
            }
            else{
                int inputCounter = counter;
                do{
                    int length = 1;
                    do{
                        System.out.print(counter);
                        length++;
                    }while (length <= inputCounter);
                    System.out.println("");
                    inputCounter--;
                }while (inputCounter >=1);
                }
                counter++;
            }while(counter <= (number));
    }
}