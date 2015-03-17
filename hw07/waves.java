//Evan Scott
//March 17 2015
//Waves with for loops, while loops, do while loops
import java.util.Scanner;

public class waves {

    public static void main (String args[]) {
        Scanner myScanner;
        myScanner=new Scanner (System.in);
       
        int counter =1; //physical, printed number counter in loop
        int secondCounter =1; //second loops counter
        int thirdCounter =1;  // third loops counter
        int number = 4;

        boolean tryAgain = false;
        System.out.print("Please enter an integer that is between 1 and 30: ");
        
            if (myScanner.hasNextInt()) {
            number = myScanner.nextInt();
                if (number < 1 || number >30 ) {
                    System.out.println("Invalid input");
                    return;
                } //end nested if
                else {
                    
                    //=============For Loop ===========
                    System.out.println();
                    System.out.println("FOR LOOP:");
                    
                    for (counter = 1; counter <= number; counter++) {
                        if (counter%2==0) { //if loopVal1 is even
                            for (secondCounter = 1; secondCounter <= counter; secondCounter++) {
                                for (thirdCounter = 1; thirdCounter <= secondCounter; thirdCounter++){
                                    
                                    System.out.print(counter);
                                    
                                } //end third for loop
                            System.out.println();
                                
                            } //end second for loop inside if
                        }//end even loopVal if statement
                        else {
                            for (secondCounter = counter; secondCounter >= 1; secondCounter--) {
                                for (thirdCounter = 1; thirdCounter <= secondCounter; thirdCounter++) {
                                    System.out.print(counter);
                                } //end third for loop inside else
                                System.out.println();
                            }//end second for loop inside else
                        } //end odd loopVal else statement
                    } //end first for loop

            //========End for loop===============
            
            //=======While loop==========
            System.out.println();
                    System.out.println("WHILE LOOP:");
                    counter = 1;
                    while (counter <= number) {
                        if (counter%2==0) { //if loopVal1 is even
                            secondCounter = 1;
                            while (secondCounter <= counter) {
                                thirdCounter = 1;
                                while (thirdCounter <= secondCounter){
                                    
                                    System.out.print(counter);
                                    thirdCounter++;
                                } //end third for loop
                            System.out.println();
                            secondCounter++;
                            } //end second for loop inside if
                        }//end even loopVal if statement
                        else {
                            secondCounter = counter;
                            while (secondCounter >= 1) {
                                thirdCounter = 1;
                                while (thirdCounter <= secondCounter) {
                                    System.out.print(counter);
                                    thirdCounter++;
                                } //end third for loop inside else
                                System.out.println();
                                secondCounter--;
                            }//end second for loop inside else
                        } //end odd loopVal else statement
                        counter++;
                    } //end first while loop
 //========end while loop=============
 
 //=========do while loop============

                System.out.println();
                    System.out.println("DO-WHILE LOOP:");
                    counter = 1;
                    do {
                        if (counter%2==0) { //if loopVal1 is even
                            secondCounter = 1;
                            do {
                                thirdCounter = 1;
                                do {
                                    
                                    System.out.print(counter);
                                    thirdCounter++;
                                } //end third for loop
                                while (thirdCounter <= secondCounter);
                            System.out.println();
                            secondCounter++;
                            } //end second for loop inside if
                            while (secondCounter <= counter);
                        }//end even loopVal if statement
                        else {
                            secondCounter = counter;
                            do {
                                thirdCounter = 1;
                                 do {
                                    System.out.print(counter);
                                    thirdCounter++;
                                } //end third for loop inside else
                                while (thirdCounter <= secondCounter);
                                System.out.println();
                                secondCounter--;
                            }//end second for loop inside else
                            while (secondCounter >= 1);
                        } //end odd loopVal else statement
                        counter++;
                    } //end first while loop
                    while (counter <= number);
   //============end do while loop=============                 
                    
                    
                    
                    
                } //end nested else
        } //end if checker statement
        else {
            System.out.println("Invalid input");
            return;
        } //end else checker statement

            
        System.out.println();
        
    }//end of main method
    
} // end of class