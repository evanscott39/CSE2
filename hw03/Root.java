//Evan Scott
//February 8 2015
//Cube Root Problem
import java.util.Scanner;

public class Root {
    
    public static void main(String[] args){
      
      Scanner myScanner;
    myScanner=new Scanner(System.in);
    
    System.out.print("Enter a double: ");
    
    double x = myScanner.nextDouble ();
    
    double sqrtGuess = x/3;
    double newGuess1 = (2*sqrtGuess*sqrtGuess*sqrtGuess+x)/(3*sqrtGuess*sqrtGuess);
    double newGuess2 = (2*newGuess1*newGuess1*newGuess1+x)/(3*newGuess1*newGuess1);
    double newGuess3 = (2*newGuess2*newGuess2*newGuess2+x)/(3*newGuess2*newGuess2);
    double newGuess4 = (2*newGuess3*newGuess3*newGuess3+x)/(3*newGuess3*newGuess3);
    double newGuess5 = (2*newGuess4*newGuess4*newGuess4+x)/(3*newGuess4*newGuess4);
    double newGuess6 = (2*newGuess5*newGuess5*newGuess5+x)/(3*newGuess5*newGuess5);
    
    System.out.println("The cube root is " +newGuess6);
    double xAgain = newGuess6*newGuess6*newGuess6;
    System.out.println("The cube of that is " +xAgain);
    
    
    
    }
    
}