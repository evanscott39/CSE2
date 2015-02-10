//Evan Scott
//February 8 2015
//Bicycle Problem
import java.util.Scanner;

public class Bicycle {
    
    public static void main(String[] args){
      
      Scanner myScanner;
    myScanner=new Scanner(System.in);
    
     System.out.print("Enter the number of seconds: "); //seconds as input variable
    int tripSeconds = myScanner.nextInt ();
    
    System.out.print("Enter the number of counts: "); //cyclometer counts input as variable
    int cyclometerCounts = myScanner.nextInt ();
    
	double wheelDiameter=27.0;//diameter in inches, needs to be converted to miles at some point
  	double PI=3.14159; //it's pi. no comment necessary
  	double feetPerMile=5280;  //conversions from feet to mile
  	double inchesPerFoot=12;   //conversions from inches to feet
  	double secToMinToHour=60;  //conversions from seconds to minutes, and also can be used from minutes to hours
    
    double distanceTrip=cyclometerCounts*wheelDiameter*PI;//distance traveled in inches (wheel diameter is in inches at present
	double distanceInMiles=distanceTrip/feetPerMile/inchesPerFoot; // Converts to distance in miles
	double timeOfTripMinutes=tripSeconds/secToMinToHour; //time of the trip converted to minutes from seconds
    double timeOfTripHours=tripSeconds/secToMinToHour/secToMinToHour; //time of the trip converted to miles from seconds
    double milesPerHour=distanceInMiles/timeOfTripHours;
    
    double newDistanceInMiles = Math.round(distanceInMiles*100); //round miles off to nice decimal
    double fixedDistanceInMiles = newDistanceInMiles/100; // I believe chen truncated his numbers to get them to look nice
    //while I rounded them. Minor differences
    
    double newTimeOfTrip = Math.round(timeOfTripMinutes*100); // round time off to decimal
    double fixedTimeOfTrip = newTimeOfTrip/100;
    
    double newMilesPerHour = Math.round(milesPerHour*100); // round mph off to decimal
    double fixedMilesPerHour = newMilesPerHour/100;
    
    
    System.out.println("The distance was " +fixedDistanceInMiles+ " miles and took " +fixedTimeOfTrip+ " minutes.");
    System.out.println("The average mph was " +fixedMilesPerHour);
    
        
    } 
    
    
} //end of class
