
import java.util.Scanner;
import java.util.Random;


public class test{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
	
        int array1[] = new int[15]; 
        int number;
        int counter = 0;
        
        int i = 0;
        System.out.print("Enter 15 ints for final grades in CSE2: ");
        while(counter<15){
            
            
            if(scan.hasNextInt()){
                number = scan.nextInt();
                array1[counter] = number;
                counter++;
                
                
            } // end if statement
            else{
                System.out.println("Not an integer, try again ");
                 return;
                
                
            } //end else
            
        } // end for loop
        System.out.println();
       for(i = 0; i<15; i++){
           
           System.out.print(array1[i]+ " ");
          
       }
        System.out.println();
        
        System.out.println("Scrambled loop: ");
        scramble(array1);
        
        for(i = 0; i<15; i++){
          System.out.print(array1[i]+ " ");
      }//end for loop
      System.out.println();
        
  } // end main method
  
  public static int[] scramble(int[] array1){
      int e = 0;
      int f = 0;
      int i = 0;
      int temp = 0;
      Random randomNumber = new Random();
      
      for(i = 0; i<100; i++){
          f = randomNumber.nextInt(15);
          e = randomNumber.nextInt(15);
          temp = array1[f];
          array1[f] = array1[e];
          array1[e] = temp;
          
          
      }//end for loop
      
      return array1;
  } //end scramble method
 

} //end public class lab11