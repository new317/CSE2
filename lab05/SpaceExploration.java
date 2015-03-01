////////////////////////////////
//Nelson Westwood
//Space Exploration Java Program
//
// Document space travel from 2000-2010
//
public class SpaceExploration {
    public static void main (String [] args) {
        int year = (int) (Math.random() * 11) + 2000;
        System.out.println("Here is a timeline of space exploration events from " + year + " to " + 2000);
        switch (year) {
            case 2010:
                System.out.println("2010: SpaceX successfully sends spacecraft to orbit and back ");
            case 2009: 
                System.out.println("2009: N/A ");
            case 2008:
                System.out.println("2008: Kepler launched to study deep space ");
            case 2007:
                System.out.println("2007: N/A ");
            case 2006:
                System.out.println("2006: Spacecraft returns with collections from a comet ");
            case 2005: 
                System.out.println("2005: Spacecraft collies with comet ");
            case 2004:
                System.out.println("2004: N/A ");
            case 2003:
                System.out.println("2003: Largest infrared telescope released ");
            case 2002:
                System.out.println("2002: N/A ");
            case 2001:
                System.out.println("2001: First spacecraft lands on asteroid ");
            case 2000:
                System.out.println("2000: First spacecraft orbits asteroid ");
                break;
                
        }
    }
}
