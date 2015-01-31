////////////////////////////////
//Nelson Westwood
//Arthimetic Java Program
//
// Compute the total cost of socks
// Compute the total cost of drinking glasses
// Compute the total cost of boxes of envelopes
// Compute and print the total cost of all goods
//
public class Arithmetic {
    // main method required for every Java program
    public static void main(String[] args) {
        //Number of pairs of socks
        int nSocks=3;
        //Cost per pair of socks
        //(‘$’ is part of the variable name)
        double sockCost$=2.58;

        //Number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$=2.29;

        //Number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
        double taxPercent=0.06;
    
        double totalSockCost$;  //total cost of socks
        double totalGlassesCost$;   //total cost of glasses
        double totalEnvelopesCost$;  //total cost of envelopes
        
        totalSockCost$ = (nSocks*sockCost$); //calculate the total cost of socks 
        totalGlassesCost$ = (nGlasses*glassCost$); //calculate the total cost of glasses 
        totalEnvelopesCost$ = (nEnvelopes*envelopeCost$); //calculate the total cost of envelopes 
        double salesTaxSocks$ = totalSockCost$ * .06; //calc dat socks sales tax
        double salesTaxGlasses$ = totalGlassesCost$ * .06; //calc dat glasses sales tax boiiiii
        double salesTaxEnvelopes$ = totalEnvelopesCost$ * .06; //Pretty explanatory here
        
        System.out.println("Total socks cost is " + totalSockCost$); //take a wild guess what I'm doing here
        System.out.println("Total glasses cost is " + totalGlassesCost$); //doin the same thang but with glasses
        System.out.println("Total envelopes cost is " + totalEnvelopesCost$); //sigh do I still need to comment 
        System.out.println("Socks sales tax is " + salesTaxSocks$); 
        System.out.println("Glasses sales tax is " + salesTaxGlasses$); 
        System.out.println("Envelopes sales tax is " + salesTaxEnvelopes$);
        
        double totalCostBeforeTax$ = totalSockCost$ + totalGlassesCost$ + totalEnvelopesCost$; //compute the total cost of the trip
        System.out.println("The total cost before tax is " + totalCostBeforeTax$); //print the total cost 
        double totalCost$ = totalCostBeforeTax$ * 1.06; //total cost with tax ja feel?
        totalCost$ = (int)(totalCost$*100)/100; //convert that ish to two decimals 
        System.out.println("The total cost is " + totalCost$); //print dat cost
    }
}