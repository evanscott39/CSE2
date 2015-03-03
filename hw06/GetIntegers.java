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
        boolean tryAgain = true;
        System.out.println("Please enter 5 non negative integers: ");
        while(tryAgain) {
        for (count=0; count <5; count++){
            String numberString = myScanner.next();
            Scanner stringScanner = new Scanner(numberString);
            if (stringScanner.hasNextInt()) {
                int integerInput = stringScanner.nextInt();
                
                if (integerInput>0) {
                    
                    tryAgain = false;
                    sumInts = sumInts + integerInput;
                } //end if statement
                else {
                System.out.println("Invalid input, enter again");
                count--;
                break;
                }//end else statement
            
                } //end if statement
            else {
            System.out.println("Invalid input, enter again");
            count--;
            break;
            
            }//end else statement
        
        
        
        } //end for loop
        
        }//end while
        
        System.out.println("Sum is " +sumInts);
    }//end of main method
    
} // end of class