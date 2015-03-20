//Nelson Westwood
//Factorials Java Program
//Create three different methods to test and print a super factorial
//Practice calling those methods 
//Print out the super factorial bruh 
//Follow me on twitter @NEWestwood
import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {
        System.out.println("Enter an integer brody");
        Scanner scan = new Scanner(System.in);
        int superFactorial = scan.nextInt();
        int total = 0;
        for(int i = 1; i <= superFactorial; i++){
            total += factorial(i);
        }
        print(total);
  }
    public static int factorial(int key){
        int multiple = 1;
        for (int i = 1; i <= key; i++){
            multiple *= i;
        }
        return multiple;
    }
    public static void print(int number){
        System.out.println("The super factorial is equal to " + number);
    }
}