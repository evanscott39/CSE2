//Evan Scott
//February 15 2015
//Which Number Problem
import java.util.Scanner;
import java.lang.*;

public class WhichNumber { 
    //main method
    public static void main(String[] args){
      
      Scanner myScanner;
    myScanner=new Scanner(System.in);

    System.out.println("Think of a number between 1 and 10 inclusive");
    System.out.print("Is the number even? ");
    String evenNumber = myScanner.next(); //input is now variable
    
      switch (evenNumber) { //begin switch statement
        case "y": case "Y": //in case yes 
          System.out.print("Is it divisible by 3? ");
          String divisibleBy3 = myScanner.next();
          
          switch (divisibleBy3) {
            case "y": case "Y":
            System.out.println("Your number is 6");
            break;
            case "n" : case  "N":
              System.out.print("Is the number divisible by 4? ");
              String divisibleBy4 = myScanner.next();
              switch (divisibleBy4) {
                case "y" : case "Y":
                System.out.print("Is the number divided by 4 greater than 1? ");
                String greaterThan1 = myScanner.next();
                switch (greaterThan1) {
                  case "y" : case  "Y":
                    System.out.println("Your number is 8");
                  break;
                  case "n" : case  "N":
                    System.out.println("Your number is 4");
                  break;
                  default:
            System.out.println("You did not enter a correct command");
                } //end greaterthan1 switch
                case "n" : case  "N": //divisible by 4 case
                  System.out.print("Is it divisible by 5? ");
                  String divisibleBy5 = myScanner.next();
                  switch (divisibleBy5) {
                    case "y" : case  "Y":
                      System.out.println("Your number is 10");
                    break;
                    case "n": case  "N":
                      System.out.println("Your number is 2");
                    break;
                  } //end divisibleby5 switch
                
              } //end divisible by 4 switch
            break;
            default:
            System.out.println("You did not enter a correct command");
          } //end of divisible by 3 switch
          break; //break even case yes
        case "n" : case  "N":
          System.out.print("Is it divisible by 3? ");
          String divBy3 = myScanner.next();
          switch (divBy3) {
            case "y" : case "Y":
              System.out.print("When divided by 3 is the result greater than 1? ");
              String div3greaterThan1 = myScanner.next();
              switch (div3greaterThan1) {
                case "y" : case  "Y":
                  System.out.println("Your number is 9 ");
                break;
                case "n" : case  "N": 
                  System.out.println("Your number is 3");
                break;
             default:
              System.out.println("You did not enter a correct command");
              }//end div3greaterthan1
              break;
            case "n": case  "N": 
              System.out.print("Is it greater than 6?");
              String greaterThan6 = myScanner.next();
              switch (greaterThan6) {
                case "y" : case  "Y":
                  System.out.println("Your number is 7");
                break;
                case "n" : case  "N": 
                  System.out.print("Is it less than 3?");
                  String lessThan3 = myScanner.next();
                  switch (lessThan3) {
                    case "y" : case  "Y":
                      System.out.println("Your number is 1");
                    break;
                    case "n" : case  "N": 
                      System.out.println("Your number is 5");
                    break;
                    default:
                    System.out.println("You did not enter a correct command");
                    
                    
                    
                    
                  }//end lessthan3
                  break;
                default:
                System.out.println("You did not enter a correct command");
              }//end greaterthan6
              break;
              default:
                    System.out.println("You did not enter a correct command");
          }//end divisibleby3
          
        break; //break even case no
        default:
        System.out.println("You did not enter a correct command");
        
      } // end even number switch statement
      
    
    
    
    } //end main method
    
} //end class