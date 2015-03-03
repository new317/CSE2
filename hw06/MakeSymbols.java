////////////////////////////////
//Nelson Westwood
//Make Symbols Java Program
//
// generate a random number between 1-100
// Print symbols based on the number and if the number is even/odd

public class MakeSymbols { //gimme dat public class 
    public static void main (String [] args) { //gimme dat main string
        
        int randomNumber = (int) (Math.random() * 100); //generate dat random number boi
        String symbol = ""; //set an empty for even symbols
        String symbol2 = ""; //set an empty for odd symbols
        int counter = 0; //set a counter ya feeeeeeeeeeeeeeeeeeeeel
        
        int test = randomNumber%2; //test if number is even or odd
        
        System.out.println("Randomly generated number " + randomNumber //print the random number big boi
        
        if (test == 0){ //if number is even 
            do {
                symbol += "*"; //add symbols to empty
                counter++; //increment counter 
            } while (randomNumber > counter); //do while the counter is less than the number
        System.out.println("The output pattern " + symbol); //print dat pattern
        }
        else { //if the number is odd
            do {
                symbol2 += "&"; //add symbols to empty
                counter++; //increment counter
            }while (randomNumber > counter); //do while...well you already know
            System.out.println("The output pattern " + symbol2); //I think you can figure this one out 
            }
        }
        }