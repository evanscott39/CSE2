
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
            array2[i] = (int)(Math.random()*100+(array2[i-1]));
            if(array2[i]<= array2[i-1] && i>0){
                i--;
                
            } ///end if statement
            
        } // end for loop
        int max = array1[0];
        int min = array1[0];
        for(i = 1; i<50; i++){
            if(array1[i]>max){
                max = array1[i];
            } // end if
            else if(array1[i]<min){
                min = array1[i];
            } // end else if
        } // end for loop
        System.out.println("The maximum of array1 is: "+max);
        System.out.println("The minimum of array1 is: "+min);
        System.out.println("The maximum of array2 is: "+array2[0]);
        System.out.println("The maximum of array2 is: "+array2[49]);
        System.out.println("Enter an int: ");
        int target;
        
            if(scan.hasNextInt()){
                target = scan.nextInt();
                
                if(target<=0){
                    System.out.println("Sorry, not a positive integer");
                   return;
                } //end if
                else{
                    i++;
                } // end else
            }// end if
            else{
                System.out.println("Sorry, not an integer");
                return;
            }
        binary(array2, target);
        
       
        
        
  } // end main method
 
public static void binary(int[] array, int target){
    
    int high = 49;
    int low = 0;
    int mid = (high+low)/2;
    
    if(target<array[0]){
        System.out.println("Number above target is: "+array[0]);
    }
    else if(target>array[49]){
        System.out.println("Number below target is: " +array[49]);
    }
    while(high>=low){
        mid = (high+low)/2;
        if(array[mid] == target){
            System.out.println(target+ " found in list");
            return;
        }//end if statement
        else if(target<array[mid]){
            high = mid - 1;
            
        }
        else{
            low = mid + 1;
        }
    }// end while statement
    
    System.out.println("numbers above and below target are: "+array[mid]+" and "+array[mid-1]);
}// end binary method

} //end public class lab11
