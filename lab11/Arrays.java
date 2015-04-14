
import java.util.Scanner;


public class Arrays{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
	
        int array1[] = new int[50]; 
        int array2[] = new int[50];
       
        int i = 0;
        
        for(i=0;i<50; i++){
            array1[i] = (int)(Math.random()*100);
            
        } // end for loop
        array2[0] = (int)(Math.random()*100);
	    for(i=1;i<50; i++){
            array2[i] = (int)(Math.random()*100*(i+1));
            if(array2[i]<= array2[i-1] && i>0){
                i--;
                
            } ///end if statement
            
        } // end for loop
        System.out.println("Array 1: ");
        for(i=0;i<50; i++){
            
            System.out.print("  " +array1[i]);
            
        } // end for loop
        System.out.println(" ");
        for(i=0;i<50; i++){
            System.out.print("  " +array2[i]);
        }
            System.out.println();
  } // end main method
 

} //end public class lab11