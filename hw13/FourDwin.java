//Evan Scott
//Homework 13, sorting 4D matrix
//April 28 2015
import java.util.Scanner;


public class FourDwin{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
	int x;
	int y;
	int lessThanCheck = 0;
    
    while(lessThanCheck<1){
        System.out.println("Enter an integer X: ");
        i = 0;
        while(i <1){
            if(scan.hasNextInt()){
                x = scan.nextInt();
                
                if(x<=0){
                    System.out.println("Sorry, please enter a positive integer");
                    
                } //end if
                else{
                    i++;
                } // end else
            }// end if
            else{
                System.out.println("Invalid Input. please enter an integer value: ");
                scan.next();
            }
            
        }//end while
        
        System.out.println("Enter an integer Y where Y > X: ");
        i = 0;
        while(i <1){
            if(scan.hasNextInt()){
                y = scan.nextInt();
                
                if(y<=0){
                    System.out.println("Sorry, please enter a positive integer");
                    
                } //end if
                else{
                    i++;
                } // end else
            }// end if
            else{
                System.out.println("Invalid Input. please enter an integer value: ");
                scan.next();
            }
            
        }//end while
    if(x<y){
        
        //all the methods to be written and put in here 
        //using x and y
        lessThanCheck++;
        
    }// end if statement
    else{
            System.out.println("Sorry, X has to be less than Y. Try again. ");
        }// end else
        
    } // end less than check
  } // end main method
  
  public static void statArray(int[][][][] array){
      
      int elementCounter = 0;
      double sum = 0;
      
      for(int i = 0; i < array.length; i++){
          for(int j = 0; j < array[i].length; j++){
              for(int k = 0; k< array[i][j].length; k++){
                  for(int l = 0; l< array[i][j][k].length; l++){
                      counter++;
                      sum = sum + array[i][j][k][l];
                  }//end l for loop
              } // end k for loop
          } // end j for loop
      } // end outside for loop
      System.out.println("Members: " +counter);
      System.out.println("Sum: " +sum);
      System.out.println("Mean: " +(sum/counter));
      
  } // end statArray method
  
  public static int[][][][] sort4DArray(int[][][][] array){
      
  }//end sort4darray method
  
  public static int[][][][] sort3DArray(int[][][][] array){
      
  }// end sort3darray method
  
  public static void printArray(int[][][][] array){
      
      
  }// end print array method
  

} //end public class lab11