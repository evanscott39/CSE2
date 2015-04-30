//Evan Scott
//factorial problem

import java.util.Scanner;
import java.util.Random;

public class ArrayInputs { 
   
    public static void main(String[] args){
     
      Scanner scan = new Scanner(System.in);
      int size;
      
      System.out.println("Enter an integer for the size of an array: ");
       int i = 0;
        
        size = scan.nextInt();
                
                
        
        int[] array = new int[size]; //declare the new array
        
      System.out.println("Please enter "+size+ " positive integers: ");
       i = 0;
        while(i <size){
            if(scan.hasNextInt()){
                array[i] = scan.nextInt();
                
                if(array[i]<=0){
                    System.out.println("Sorry, please enter a positive integer");
                    
                } //end if
                else{
                    i++;
                } // end else
            }// end if
            else{
                System.out.println("please enter an integer value");
                scan.next();
            }
            
        }//end while
        
        System.out.println("The array is: ");
        for(i = 0; i<array.length; i++){
            System.out.println(array[i]);
            
        }
    }//end main method
    
}//end class