//Evan Scott
//March 2 2015
//Make Symbols problem with do while loops

import java.util.Random;

public class MakeSymbols {

    public static void main (String args[]) {
        int number = (int) (Math.random()*100);

        int count = 1;
        System.out.println("Random number generated: " +number);
      
        if (number % 2 ==0) {
            do {
                System.out.print("*");
                count++;
            } //end do statement
            while (count <= number);
        } //end if statement
        else {
            do {
                System.out.print("&");
                count++;
            } //end do statement
            while (count <= number);
            
        } //end else statement
            
        System.out.println(" ");
       
        
    }//end of main method
    
} // end of class