
import java.util.Scanner;
import java.util.Random;


public class CSE2Linear{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
	
        int array1[] = new int[15]; 
        int number;
        int counter = 0;
        array1[0] = -1;
        int oneLess;
        
        int i = 0;
        System.out.print("Enter 15 ints for final grades in CSE2: ");
        while(counter<15){
            oneLess = counter - 1;
            
            if(scan.hasNextInt()){
                number = scan.nextInt();
                if (number <0 || number >100){
                    System.out.println("Not in the required range ");
                }
                else{
                    
                    if(number < array1[counter]){
                        System.out.println("Not greater than or equal to last int ");
                    }
                    else{
                        
                        array1[counter] = number;
                        counter++;
                        
                    } // end else
                  
                }// end else
            } // end if statement
            else{
                System.out.println("Not an integer, try again ");
                 String string = scan.next();
               
            } //end else
            
        } // end for loop
        System.out.println();
       for(i = 0; i<15; i++){
           
           System.out.print(array1[i]+ " ");
          
       }
        System.out.println();
        
        
        System.out.println("Enter a grade to search for: ");
        int grade = scan.nextInt();
        
        binarySearch(array1, grade);
        
        System.out.println("Scrambled loop: ");
        scramble(array1);
        for(i = 0; i<15; i++){
          System.out.print(array1[i]+ " ");
      }//end for loop
      System.out.println();
        System.out.println("Enter a grade to search for: ");
        int target = scan.nextInt();
        
        linearSearch(array1, target);
        
        
        
  } // end main method
  
 public static int[] scramble(int[] array1){
      int e = 0;
      int f = 0;
      int i = 0;
      int temp = 0;
      Random randomNumber = new Random();
      
      //had this done well with Math.random but this is with
      //the Random class, as requested
      
      for(i = 0; i<100; i++){
          f = randomNumber.nextInt(15);
          e = randomNumber.nextInt(15);
          temp = array1[f];
          array1[f] = array1[e];
          array1[e] = temp;
          
          
      }//end for loop
      
      return array1;
  } //end scramble method
  
  public static int[] linearSearch(int[] array1, int target){
      
      int i;
      int counter = 0;
      for(i = 0; i<array1.length; i++){
          if(target == array1[i]){
              
              System.out.println(target+ " was found in the list with "+(i+1)+" iterations");
              counter++;
              break;
          }// end if statement
         
      }//end for loop
      if(counter<1){
          System.out.println(target+ " was not found in the list with "+(i+1)+" iterations");
      }
      return array1;
  } //end linear search method
  
  public static int[] binarySearch(int[] array1, int grade){
      
      int upper = 14;
      int lower = 0;
      int middle  = (upper-lower)/2;
      int iterationCount = 0;
      
      boolean match = false;
      
      while(upper-lower >0){
          iterationCount++;
          if(array1[middle]==grade){
              match = true;
              break;
          } // end matching if statement
          else if(array1[middle] <grade){
              lower = middle;
              middle = (upper + lower + 1)/2;
          }
          else{
              upper = middle;
              middle = (upper + lower - 1)/2;
          }
      }//end encompassing while loop
      if(match){
          System.out.println(grade+" was found in the list with "+iterationCount+" iterations");
      }
      else{
          System.out.println(grade+" was not found in the list with "+iterationCount+" iterations");
      }
      return array1;
  } // end binarySearch method
 

} //end public class lab11