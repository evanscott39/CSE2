//Evan Scott
//Homework 12, multiplying matrices
//April 21 2015
import java.util.Scanner;


public class Multiply{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
	
        int width1 = 0;
        int height1 = 0;
        int width2 = 0;
        int height2 = 0;
        int i = 0;
        int dimensionCheck = 0;
        
    while(dimensionCheck<1){
        System.out.println("Enter the width of array 1");
        i = 0;
        while(i <1){
            if(scan.hasNextInt()){
                width1 = scan.nextInt();
                
                if(width1<=0){
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
        System.out.println("Enter the height of array 1");
        i = 0;
        while(i <1){
            if(scan.hasNextInt()){
                height1 = scan.nextInt();
                
                if(height1<=0){
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
        System.out.println("Enter the width of array 2");
        i = 0;
        while(i <1){
            if(scan.hasNextInt()){
                width2 = scan.nextInt();
                
                if(width2<=0){
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
        System.out.println("Enter the height of array 2");
        i = 0;
        while(i <1){
            if(scan.hasNextInt()){
                height2 = scan.nextInt();
                
                if(height2<=0){
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
        if(height1 == width2){
            
            //combo of creating two random matrices with the correct dimensions and
            // multiplying them together using the randomMatrix method as the int[][] 
            // needed for the multiply method
            int[][] firstRandom = randomMatrix(height1, width1);
            int[][] secondRandom = randomMatrix(height2, width2);
            System.out.println("First matrix: ");
            printMatrix(firstRandom);
            System.out.println("Second matrix: ");
            printMatrix(secondRandom);
            System.out.println("Multiplied matrix: ");
            int[][] multiplied =  multiply(firstRandom, secondRandom);
            printMatrix(multiplied);
            dimensionCheck++;
        }
        else{
            System.out.println("Incorrect dimensions, retry please");
        }
    } // end dimensioncheck
        
        
        
  } // end main method
  
  public static int[][] randomMatrix(int rowNum, int columnNum){
      int[][] array1 = new int[rowNum][];
      
      for(int i = 0; i< rowNum; i++){
          array1[i] = new int[columnNum];
          for(int j = 0; j<columnNum; j++){
              array1[i][j] = (int) (Math.random()*20 - 10);
              
          } // end j for loop
      } //end i for loop
      
      return array1;
      
  } // end randommatrix
 
 public static int[][] multiply(int[][] array1, int[][]array2){
     int[][] multipliedArray = new int[array1.length][array2[0].length];
     for(int i = 0; i<array1.length; i++){
         for(int j = 0; j<array2[0].length; j++){
             for(int k = 0; k<array1[0].length; k++){
                 multipliedArray[i][j] = array1[i][k] * array2 [k][j];
                 
             }// end k for loop
         }// end j for loop
         
     } //end i for loop
     return multipliedArray;
 } // end multiply method
 
 public static void printMatrix(int[][] array1){
     for(int i = 0; i<array1.length; i++){
         System.out.print("["); //beginning bracket at each row
         for(int j = 0; j<array1[i].length; j++){
             System.out.print(" " +array1[i][j]+ " "); //print individual values and spaces
         }//end j for loop
         System.out.println("]"); // ending bracket at each row
     }// end i for loop
 } // end printmatrix method

} //end public class lab11