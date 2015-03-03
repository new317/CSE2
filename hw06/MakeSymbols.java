////////////////////////////////
//Nelson Westwood
//Make Symbols Java Program
//
// generate a random number between 1-100
// Print symbols based on the number and if the number is even/odd

public class MakeSymbols {
    public static void main (String [] args) {
        
        int randomNumber = (int) (Math.random() * 100);
        String symbol = "";
        String symbol2 = "";
        int counter = 0;
        
        int test = randomNumber%2;
        
        System.out.println("Randomly generated number " + randomNumber);
        
        if (test == 0){
            do {
                symbol += "*";
                counter++;
            } while (randomNumber > counter);
        System.out.println("The output pattern " + symbol);
        }
        else {
            do {
                symbol2 += "&";
                counter++;
            }while (randomNumber > counter);
            System.out.println("The output pattern " + symbol2);
            }
        }
        }