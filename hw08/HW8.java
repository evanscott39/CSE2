
import java.util.Scanner;

public class HW8 {
public static void main(String[] args) {
        char option;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        String input = getInput(scan, "Cc");
        System.out.println("You are in a dead valley.");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You walked and walked and walked and you saw a cave!");
        cave();
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("Unfortunately, you ran into a GIANT!");
        giant();
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
        input = getInput(scan, "AaEe", 10);
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three 3 treasure box in front of you! Enter the box number you want to open!");
        box();
        input = getInput(scan);
        System.out.println("Hero! Have a good day!");
    } //end main method

//giant method
   public static void giant() {
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    } //end giant method

//cave method
  public static void cave() {
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }

//box method
  public static void box(){
       System.out.println("                      *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
    }

//string getInput method
public static String getInput(Scanner scan, String string) {
    string = scan.next(); //take input
    if (string.equals("c") || string.equals("C")) {
        return string;
    }
    else {
        System.out.println("Yea right loser!");
        System.exit(1);
        return string;
    }
    
} //end scan string getInput method

//start scan string int getInput method
public static String getInput(Scanner scan, String string, int trial) {
    string = scan.next();
        if (string.equals("a") || string.equals("A")) {
            int oneOrZero = (int)(Math.random() *2);
            if (oneOrZero==0) {
                System.out.println("Gosh! How can you miss it!");
                getInput(scan, string, trial);
                
            }//end oneOrZero if statement
            else {
                System.out.println("Critical hit!");
                trial--;
                if (trial ==0) {
                    return string;
                    
                } //end trial = 0 if statement
                else {
                    getInput(scan, string, trial);
                } //end else
            }
        return string;
    }
    else if (string.equals("E") || string.equals("e")){
        int check = (int)(Math.random()*10) +1;
        if (check==10){
            return string;
        }
        else{
            getInput(scan, string, trial);
            
        }
        return string;
    } //end elseif
    else {
        System.out.println("Executed by GIANT! Game over!");
        System.exit(1);
        return string;
        
    } //end else
    
} // end scan string int getInput method
//getInput scan
public static String getInput(Scanner scan){
    String number = scan.next();
    
    switch (number){
        case "1":
            System.out.println("You found gold! Lots of gold");
        break;
        case "2": 
            System.out.println("You found some cobwebs and an old book. Read some more.");
        break;
        case "3":
            System.out.println("You have no idea what it's called, but it looks shiny. Congrats!");
        break;
        default:
        System.out.println("Wrong Number! You get nothin! better restart the game LOL");
        
    } //end switch
    
        return number;
    
}//end getInput scanner


} //end public class hw8