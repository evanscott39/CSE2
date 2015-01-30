//Evan Scott
//Jan 30 2015
//CSE 002 Lab 02
//This is a program to measure the times and wheel rotations of the two trips as well as
//the distance of the two trips individually and combined

public class Cyclometer{
    
  public static void main(String [] args){
      
	int secsTrip1=480;  //Time for trip 1 in seconds
	int secsTrip2=3220;  // Time for trip 2 in seconds 
	int countsTrip1=1561;  //Revolutions of the front wheel for trip one
	int countsTrip2=9037; //Revolutions of the front wheel for trip two
	double wheelDiameter=27.0;//diameter in inches, needs to be converted to miles at some point
  	double PI=3.14159; //it's pi. no comment necessary
  	double feetPerMile=5280;  //conversions from feet to mile
  	double inchesPerFoot=12;   //conversions from inches to feet
  	double secondsPerMinute=60;  //conversions from seconds to minutes
	double distanceTrip1, distanceTrip2,totalDistance;
 
	System.out.println("Trip 1 took "+
       	(secsTrip1/secondsPerMinute)+" minutes and had "+
       	countsTrip1+" counts.");
	System.out.println("Trip 2 took "+
       	(secsTrip2/secondsPerMinute)+" minutes and had "+
       	countsTrip2+" counts."); //all the distances
	        distanceTrip1=countsTrip1*wheelDiameter*PI;//distance traveled in inches (wheel diameter is in inches at present)
    	//diameter times pi gives circumference
	        distanceTrip1/=inchesPerFoot*feetPerMile; // Converts to distance in miles
	        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        	totalDistance=distanceTrip1+distanceTrip2;
	
	System.out.println("Trip 1 was "+distanceTrip1+" miles"); //print out distance 1
	System.out.println("Trip 2 was "+distanceTrip2+" miles"); //print out distance 2
	System.out.println("The total distance was "+totalDistance+" miles"); //print out distance 1+2
	
        } //end main method
        
  } //end class
