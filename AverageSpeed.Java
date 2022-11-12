// Hocian Wade Sep 27, 2022 COSC 1046 N - Assignment 1
public class AverageSpeed {
    public static void main (String[] args){
        double kmToMiles = 0.62137119; // Scalar value for unit conversion
	    int distanceKm = 15; // Km 
	    double hours = 0.8416666666666667;
	    
	    double distanceMiles = distanceKm * kmToMiles;
	    double speedMPH = distanceMiles / hours; // Average Speed of the runner
	    System.out.println((float)speedMPH); // Turns the double value to float for smaller result (11.07 mph)
    }
}