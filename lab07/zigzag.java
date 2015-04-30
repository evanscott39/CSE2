//Evan Scott
//zigzag problem

import java.util.Scanner;

public class zigzag { 
    
    //main method
    public static void main(String[] args){
        int i;
        Scanner scan = new Scanner(System.in);
        int k;
        int nStars = 10;
        String checkOne = "Y";
        String checkTwo = "y";
        boolean check = true;
        boolean input = true;
        
        while(check){
            while(input){
            System.out.print("Enter an int between 3 and 33: ");
            if(scan.hasNextInt()){
                 nStars = scan.nextInt();
                if(nStars<3 || nStars>33){
                    System.out.println("Number is out of range, try again.");
                    scan.next();
                }
                else{
                    for(i = 0; i<nStars; i++){
                        System.out.print("*");
                    }
                    System.out.println();
                    for(i = 1; i<nStars-1;i++){
                        for(k = 0; k<i; k++){
                         System.out.print(" ");
                        }//end nested for loop
                     System.out.println("*");
                    }//end for loop
                    for(i = 0; i<nStars; i++){
                        System.out.print("*");
                    }
                    System.out.println();
                  input = false;
                }//end nested else
            } //end outside if
            else{
                System.out.println("You must enter an integer: ");
                scan.next();
            }//end outside else
            }//end input boolean
            
            System.out.print("Enter Y or y to go again: ");
            String userInput = scan.next();
            if(userInput.equals(checkOne) || userInput.equals(checkTwo)){
                input = true;
            }
            else{
                break;
            }
        }//end check boolean while loop
    }//end main method
}//end class