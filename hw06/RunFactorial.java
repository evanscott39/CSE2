//Evan Scott
//March 2 2015
//Get Integers Problem with Loops
import java.util.Scanner;

public class RunFactorial {

    public static void main (String args[]) {
        Scanner myScanner;
        myScanner=new Scanner (System.in);
        int count=1; //initialize the counter
        
        int factorial  = 1;
       // boolean tryAgain = true;
        System.out.println("Please enter an integer that is between 9 and 16: ");
       // do {
            
            if (myScanner.hasNextInt()) {
                int number = myScanner.nextInt();
                if (number <9 || number >16) {
                    System.out.println("Invalid input, try again");
                   // continue;
                } //end second if statement
                else {
                    while (count <= number) {
                        factorial = factorial * count;
                        count++;
                        //tryAgain = false;
                        
                        
                    }//end while statement
                    System.out.println("Input accepted: ");
                        System.out.println(number+ "! = " +factorial);
                }// end else statement
               
                
            } //end if statement
            else {
                System.out.println("Invalid input, ");
               // int number = myScanner.nextInt();
                
            }// end else statement
      
        //}//end do
       // while (tryAgain);
        
        
        
    }//end of main method
    
} // end of class