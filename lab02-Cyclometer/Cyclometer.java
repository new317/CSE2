////////////////////////////////
//Nelson Westwood
//Cyclometer Java Program
//
// Print the print the number of minutes for each trip
// Print the number of counts for each tirp
// Print the distance of each trip in miles
// Print the distance for the two trips combined
//
public class Cyclometer {
    // main method required for every Java program
    public static void main(String[] args) {
        //our input data
        int secsTrip1=480;  //seconds for trip 1
        int secsTrip2=3220;  //seconds for trip 2
        int countsTrip1=1561;  //counts for trip 1
        int countsTrip2=9037; //counts for trip 2
        
        // our intermediate variables and output data.
      double wheelDiameter=27.0,  //the wheel diameter
      PI=3.14159, //value of PI
      feetPerMile=5280,  //number of feet in a mile
      inchesPerFoot=12,   //inches in a foot
      secondsPerMinute=60;  //seconds in a minute
      double distanceTrip1, distanceTrip2,totalDistance;
      
            System.out.println("Trip 1 took "+
                (secsTrip1/secondsPerMinute)+" minutes and had "+
                 countsTrip1+" counts.");
            System.out.println("Trip 2 took "+
                (secsTrip2/secondsPerMinute)+" minutes and had "+
                 countsTrip2+" counts.");
                 
                 distanceTrip1=countsTrip1*wheelDiameter*PI; //calculating the distance of trip 1
                 distanceTrip1/=inchesPerFoot*feetPerMile; // Gives distance in miles
                 distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;//doing the same as above for trip 2 
                 totalDistance=distanceTrip1+distanceTrip2;
                 
                 //Print out the output data.
           System.out.println("Trip 1 was "+distanceTrip1+" miles");
           System.out.println("Trip 2 was "+distanceTrip2+" miles");
           System.out.println("The total distance was "+totalDistance+" miles");







        
    }//end of main method
}//end of class