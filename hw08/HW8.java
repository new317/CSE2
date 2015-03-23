//Nelson Westwood
//Factorials Java Program
//Create a game with a bunch of different methods and all that jazz
//Follow me on twitter @NEWestwood

import java.util.Scanner;
public class HW8 {
public static void main(String[] args) {
        char option;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        String input = getInput(scan, "Cc");
        System.out.println("You are in a dead valley.");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You walked and walked and walked and you saw a cave!");
        cave();
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("Unfortunately, you ran into a GIANT!");
        giant();
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else is to YIELD");
        input = getInput(scan, "AaEe", 10);
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
        box();
        input = getInput(scan);
        System.out.println("Hero! Have a good day!");
    }
    
   public static void giant() {
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");

}
 public static void cave() {
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
        
    }
public static void box(){
       System.out.println("                      *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
    }
public static String getInput(Scanner scan, String string){
  string = scan.next();
  if (string.equals("C") || string.equals("c")){
      return string;
}
else { 
    System.out.println("YA RIGHT YOU BUM"); 
    System.exit(1);
}
return string;
}
public static String getInput(Scanner scan, String string , int trial){
    string = scan.next();
    if (string.equals("A") || string.equals("a")){
        int hit = (int) (Math.random()*2);
        if (hit == 0){
            System.out.println("HOW COULD YOU MISS IT! IT'S A GIANT FOR F-SAKE");
            getInput(scan, string, trial);
            
        }
        else {
            System.out.println("Critical hit leggo");
            trial = trial - hit;
            if (trial == 0){
                return string;
            }
            else{
                getInput(scan, string, trial);
            }
        }
        
        
        
    }
    else if (string.equals("E") || string.equals("e")){
        int escape = (int) (Math.random()*10) + 1;
        if (escape == 10){
            System.out.println("You ran like a little female dog, but you did so successfully");
            return string;
            }
        else {
            System.out.println("You tried running through the six and failed, enter again");
            getInput(scan, string, trial);
        }
    }
    else {
        System.out.println("THE GIANT MURDERED YOU HAHAHAHAHA!!!!");
        System.exit(1);
    }
    return string;
    
}
public static String getInput(Scanner scan){
    String string = scan.next();
    switch(string){
        case "1": 
            System.out.println("It's...a pet rock!");
            break;
        case "2": 
            System.out.println("Your reward is getting through this program, be thankful");
            break;
        case "3": 
            System.out.println("1 billion dollars, your rich!");
            break;
        default: System.out.println("A wrong number! How could you be so stupid bruh? It's just between 1 and 3");
        break;
    }
    return string;
}
}

