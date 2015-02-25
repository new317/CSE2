import java.util.Scanner;
public class Untitled1 {
    public static void main (String [] arg) {
        int x = 1/2 + 3*4;
        System.out.println("X equals " + x);
        Scanner scan = new Scanner(System.in);
        int n = 0;
        boolean goodData;
        goodData = scan.hasNextInt();
        if (goodData) {
            n = scan.nextInt();
            
        }
        if (!goodData || n < 10000 || n > 99999){
            System.out.println("Bad Input");
            return;
        }
        if (n/10000 == n%10 && n/10%10 == n/1000%10){
            System.out.println("Symmetric");
            
        }
        else{
            System.out.println("Asymmetric");
            
        }
        
    }
}