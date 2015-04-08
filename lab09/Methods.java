//Nelson Westwood
//Methods Java Program
//
// generate a random number between 0-9
// Create sentence based on methods and such

import java.util.Random;
import java.util.Scanner;

public class Methods {
    public static void main (String [] args){
        Scanner scan = new Scanner(System.in);
        //String input = scan.Next();
        Random randomGenerator = new Random();
    
        int integer1 = randomGenerator.nextInt(10);
        int integer2 = randomGenerator.nextInt(10);
        int integer3 = randomGenerator.nextInt(10);
        int integer4 = randomGenerator.nextInt(10);
        String adjective = Adjective(integer1);
        String subject = Subject(integer2);
        String verb = Verb(integer3);
        String object = object(integer4);
        System.out.println("The" + " " + adjective + " " + subject + " " + verb + " the " + object + ".");
        
    }

public static String Adjective (int integer1){
    switch (integer1){
        case 0:
            return "smelly";
        case 1:
            return "happy";
        case 2:
            return "sad";
        case 3:
            return "yolked";
        case 4:
            return "moist";
        case 5:
            return "lukewarm";
        case 6:
            return "jejune";
        case 7:
            return "obtuse";
        case 8:
            return "tender";
        case 9:
            return "dowdy";
            
    }
    return "ur mom";
}
public static String Subject (int integer2){
    switch (integer2){
         case 0:
            return "bear";
        case 1:
            return "dog";
        case 2:
            return "cat";
        case 3:
            return "mother";
        case 4:
            return "father";
        case 5:
            return "son";
        case 6:
            return "daughter";
        case 7:
            return "monkey";
        case 8:
            return "tiger";
        case 9:
            return "lion";
    }
    return "ur mom";
}
public static String Verb (int integer3){
    switch (integer3){
         case 0:
            return "smelled";
        case 1:
            return "jumped";
        case 2:
            return "flew";
        case 3:
            return "ate";
        case 4:
            return "flexed on";
        case 5:
            return "trapped";
        case 6:
            return "listened to";
        case 7:
            return "hugged";
        case 8:
            return "shot";
        case 9:
            return "fried";
    }
    return "ur mom";
}
public static String object (int integer4){
    switch (integer4){
         case 0:
            return "bear";
        case 1:
            return "dog";
        case 2:
            return "cat";
        case 3:
            return "mother";
        case 4:
            return "father";
        case 5:
            return "son";
        case 6:
            return "daughter";
        case 7:
            return "monkey";
        case 8:
            return "tiger";
        case 9:
            return "lion";
    }
    return "ur mom";
}
}
