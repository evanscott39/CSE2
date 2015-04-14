
import java.util.Scanner;


public class RemoveElements{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
	
        int num[]=new int[10];
        int newArray1[];
        int newArray2[];
        int index,target;
        
	String answer="";
	do{
  	System.out.print("Random input 10 ints [0-9]");
  	num = randomInput();
  	String out = "The original array is:";
  	out += listArray(num);
  	System.out.println(out);
 
  	System.out.print("Enter the index ");
  	index = scan.nextInt();
  	newArray1 = delete(num, index);
  	String out1="The output array is ";
  	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out1);
 
      System.out.print("Enter the target value ");
  	target = scan.nextInt();
  	newArray2 = remove(newArray1,target);
  	String out2="The output array is ";
  	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out2);
  	 
  	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
  }
 
  public static String listArray(int num[]){
	String out="{";
	for(int j=0;j<num.length;j++){
  	if(j>0){
    	out+=", ";
  	}
  	out+=num[j];
	}
	out+="} ";
	return out;
 
}


//randomInput method
   public static int[] randomInput() {
   
        int[] list;
        list = new int[10];
        int i;
        for(i = 0; i <10; i++){
            list[i] = (int)(Math.random()*10);
           
        }
       
        return list;
        
    } //end randominput method

//delete method
  public static int[] delete(int[] list, int pos) {
      
      
        int[] newArray;
        newArray = new int[9];
        int i=list.length;
        int a = 0;
        int b = 0;
        if(pos>i || pos<0) {
            System.out.println("The index is not valid.");
            return list;
            
        }//end pos checker
        
        
        while(a<i){
            if(a == pos) {
                a++;
                continue;
            } // end if statement
            newArray[b] = list[a];
            a++;
            b++;
            
        }//end while loop
        return newArray;
    } //end delete method

//remove method
  public static int[] remove(int[] list, int target){
     
    int i = 0;
    int digitsRemoved  = 0;
    int a = 0;
    int b = 0;
    int test = 0;
    int length = list.length;
    int counter = 0;
    
    while(i < length) {
        
    if(list[i] == target) {
    
    counter++;
   
        
    } // end if statement
    
        i++;
   }//end while
   if(counter >0){
       System.out.println("Element " +target+ " has been found ");
   }
   else{
       System.out.println("Element " +target+ " was not found ");
   } //end else
    i = 0;
    //determine number of targets and therefore length of new array
    while(i <length){
        if(list[i] == target){
            digitsRemoved++;
            
        }//end if statement
        i++;
        
    }//end while statement
    int listlength = list.length-digitsRemoved;
    int[] targetedArray = new int [listlength];
    
    
    i = 0;
    a = 0;
    //&& b<listlength
    while(a<length ) {
        if(list[a] != target){
            targetedArray[b] = list[a];
            b++;
        } //end if statement
        
        a++;
        
    } //end while statement
    return targetedArray;
    
    
    
    } //end remove method

} //end public class hw10