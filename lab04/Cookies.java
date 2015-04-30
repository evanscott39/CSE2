//Evan Scott
//February 13 2015
//Cookies Problem
import java.util.Scanner;

public class Cookies { 
    //main method
    public static void main(String[] args){
        int people;
        int cookies;
        int cookiesPerPeople;
        
      
    Scanner scan =new Scanner(System.in);
    System.out.print("Enter the mumber of people: "); //user input # of people
    if(scan.hasNextInt()){
        people = scan.nextInt();
        if(people > 0){
            
         
            
            System.out.print("Enter the mumber of cookies you are planning to buy: "); //user input # of cookies
            if(scan.hasNextInt()){
                cookies = scan.nextInt ();
                if(cookies > 0){
            
                    
                    System.out.print("How many do you want each person to get?  "); //user input # of people
                        if(scan.hasNextInt()){
                            cookiesPerPeople = scan.nextInt ();
                             if(cookiesPerPeople > 0){
            
                            
                            
    
        } // end nested if
        else{
            System.out.println("Number must be greater than 0");
            return;
        } // end nested else
    
   
    }//end if
    else{
        System.out.println("You did not enter an int");
        return;
    }
    
        } // end nested if cookies
        else{
            System.out.println("Number must be greater than 0");
            return;
        } // end nested else cookies
    
   
    }//end if cookies
    else{
        System.out.println("You did not enter an int");
        return;
    } // end else cookies
    
        } // end nested if people
        else{
            System.out.println("Number must be greater than 0");
            return;
        } // end nested else people 
    
   
    }//end if
    else{
        System.out.println("You did not enter an int");
        return;
    }
     
    if((cookiesPerPeople*people) <= cookies){
        if(cookies%people == 0){
            
            System.out.println("You have enough cookies for each person and the amount will divide evenly");
            
        }
        else{
            System.out.println("You have enough, but they will not divide evenly");
            
        }
    }
    else{
        System.out.print("You do not have enough cookies. You need to buy at least ");
        System.out.print(cookiesPerPeople*people-cookies);
        System.out.println(" more");
    }
    
    
    
    } //end of main method
    
 } //end of class