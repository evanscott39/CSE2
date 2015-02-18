//Evan Scott
//February 15 2015
//Which Number Problem
import java.util.Scanner;
import java.lang.*;

public class Banking { 
    //main method
    public static void main(String[] args){
      
      Scanner myScanner;
    myScanner=new Scanner(System.in);

    double rndm = Math.random(); //gets random # between 0 and 1
    double bank1 = (rndm*4000)+1000;
    int currentBalance = (int) bank1; //outputs # between 1000 and 5000
    
    System.out.println("Your current balance is $"+currentBalance);
    //prints out current balance
    
    System.out.print("Would you like to (deposit), (withdraw), or view your (balance): " );
    String takenAction = myScanner.next();
    switch (takenAction) { //begin switch statement
        case "deposit": //depositing case
        System.out.print("Enter the amount you would like to deposit: $");
        int depositedMoney = myScanner.nextInt();
            if (depositedMoney <0) { //if statement beginning
            System.out.println("You did not enter a positive number");
            }//end of if statement
            else {
            int balanceAfterDeposit = currentBalance+depositedMoney;
            System.out.println("Your balance is now $" +balanceAfterDeposit);
            } // end of else statement
            break; //end of d case
        case "withdraw": //withdrawing case
        System.out.print("Enter the amount you would like to withdraw: $");
        int withdrawMoney = myScanner.nextInt();
            if (withdrawMoney <0) { //beginning if
            System.out.println("You did not enter a positive number");
            }//end if
            else if (withdrawMoney > currentBalance) { //beginning else
            System.out.println("You requested more than your current balance");
            }//end else if
            else {
                int newBalance = currentBalance-withdrawMoney; //ha! new balance
                System.out.println("Your new balance is $" +newBalance);
            } //end else
            break; //end of w case
        case "balance": //check balance case
            System.out.println("Your current balance is $" +currentBalance);
            break; //end of b case
        default:
        System.out.println("You did not enter a proper command ");
        
   
        
        
    } //end of switch
    
    
    
    
    
    } //end of main method
    
} //end of class