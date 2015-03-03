//Evan Scott
//March 2 2015
//Get Integers Problem with Loops
import java.util.Scanner;

public class GetIntegers {

    public static void main (String args[]) {
        Scanner myScanner;
        myScanner=new Scanner (System.in);
        int count; //initialize the counter
        int sumInts = 0; //initialize sum counter
        int integerInput2 = 0;
        
        for (count=0; count <5; count=count){
            if (myScanner.hasNextInt()) {
                int integerInput = myScanner.nextInt();
                
                if (integerInput>0) {
                    
                    count++;
                    sumInts = sumInts + integerInput;
                } //end if statement
                else {
                System.out.println("Invalid input, enter again");
                break;
                }//end else statement
            
                } //end if statement
            else {
            System.out.println("Invalid input, enter again");
            break;
            
            }//end else statement
        
        
        
        } //end for loop
        
        System.out.println("Sum is " +sumInts);
        
    }//end of main method
    
} // end of class