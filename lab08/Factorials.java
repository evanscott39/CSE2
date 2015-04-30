//Evan Scott
//factorial problem

import java.util.Scanner;

public class Factorials { 
   
    public static void main(String[] args){
        int i;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int input = scan.nextInt();
        int sum = 0;
        
        for(i = 1; i<= input; i++){
            sum += factorial(i);
            
        }//end for loop
        print(input, sum);
        
    }//end main method
    public static int factorial(int input){
        int number = 1;
        for (int i = 1; i<=input; i++){
            number = number*i;
        }
        return number;
    }//end factorial method
    public static void print(int input, int sum){
        System.out.print("The super factorial of " +input+" is "+sum);
        System.out.println();
    }//end print method
    
}//end class