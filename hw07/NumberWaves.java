//Nelson Westwood
//Number Waves Java Program
//Create a wave of numbers using for, while, and do-while loops
//Print the waves out with those numbers bruh

import java.util.Scanner; //import da scanner
public class NumberWaves {
    //public class 
    public static void main (String [] args){
        //dat main method boi
        Scanner myScanner;
        myScanner = new Scanner(System.in);
        int number = -2;
        String input;
        
        System.out.println("Enter a number between 1 and 30 bruh");
        while (number < 1 || number > 30){
            while (!myScanner.hasNextInt()){
                System.out.println("Improper input");
                myScanner.next();
            }
            number = myScanner.nextInt();
            if (number >=1 && number <=30){
                break;
            }
                else {
                    System.out.println("Invalid input, cmon bruh");
                }
            }
            System.out.println("For Loop: ");
            for (int counter = 1; counter <= number; counter++){
                if (counter%2 == 0){
                    input = "";
                    for (int inputCounter = 1; inputCounter <= counter; inputCounter++){
                        input += counter;
                        System.out.println(input);
                    }
                }
                else{
                    for (int inputCounter = counter; inputCounter>=1; inputCounter--){
                        for (int length = 1; length <= inputCounter; length ++){
                            System.out.print(counter);
                        }
                        System.out.println("");
                    }
                    
                }
            }
        System.out.println("While Loop: ");
        int counter = 1;
        while(counter <= number){
            if (counter%2 == 0){
                input = "";
                int inputCounter = 1;
                while (inputCounter <= counter){
                    inputCounter++;
                    input += counter;
                    System.out.println(input);
                    
                }
            }
            else{
                int inputCounter = counter;
                while (inputCounter >=1){
                    int length = 1;
                    while (length <= inputCounter){
                        System.out.print(counter);
                        length++;
                    }
                    System.out.println("");
                    inputCounter--;
                }
                }
                counter++;
            }
        System.out.println("Do while loop: ");
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