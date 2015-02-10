//Evan Scott
//February 8 2015
//Digits Problem
import java.util.Scanner;

public class FourDigits {
    
    public static void main(String[] args){
      
      Scanner myScanner;
    myScanner=new Scanner(System.in);
    System.out.print("Enter a double ");
    double myNumber = myScanner.nextDouble ();
    int smallMyNumber = (int) myNumber;
    
   // int myIntNoDec = (int) myNumber; //cast to int, remove decimals
   // int myIntDecimals = (int) newMyNumber; //cast to int with decimals
    
   // double myDoubNoDec = (double) myIntNoDec; //cast to double without decimals
   // double myDoubNoD = myDoubNoDec*10000;
    //double myDouble = (double) myIntDecimals; //cast to double with decimals
   double decimals = myNumber-smallMyNumber; //take away non decimals
    int firstDec = (int) (decimals*10);
    int secondDec = (int) (decimals*100 - firstDec*10);
    int thirdDec = (int) (decimals*1000 -(secondDec*10+firstDec*100));
    int fourthDec = (int) (decimals*10000 -(thirdDec*10+secondDec*100+firstDec*1000));
    
    System.out.println("The four digits are " +firstDec + secondDec + thirdDec + fourthDec);
    
    
    
    
    
    }
    
}