////////////////////////////////
//Nelson Westwood
//Smile Generator Java Program
//
// Print the some smiles based on a random number generator
//

public class SmileGenerator {
public static void main (String [] args) {
    int smile = 0;
    for (int smiles = 0;smiles<5;smiles++){
        System.out.print(":)");
    }
    System.out.println("");
    while (smile<5){
        System.out.print(":)");
        smile++;
    }
    System.out.println("");
    int smileS = 0;
    do{
        System.out.print(":)");
        smileS++;
    } while(smileS < 5);
    System.out.println("");
    double randSmiles = (int) (Math.random()*100);
    for (int randSmile = 0;randSmile<randSmiles;randSmile++){
        System.out.print(":)");
    }
    for (int randSmile = 0;randSmile<randSmiles;randSmile++){
        if (randSmile%30==0){
            System.out.println("");
        }
        System.out.print(":)");
    }
    System.out.println("");
    String smiley = "";
    double randCounter = (int) (Math.random()*100);
    for (int lineNumber = 0;lineNumber < randCounter ;lineNumber++){
        smiley+=":)";
        System.out.print(smiley);
        System.out.println("");
            
        
    }
    
    }
}
