//Evan Scott
//factorial problem

import java.util.Scanner;
import java.util.Random;

public class Methods { 
   
    public static void main(String[] args){
      boolean checker = true;
      Scanner scan = new Scanner(System.in);
      while(checker){
       
        System.out.println("The " +adjective()+" "+adjective()+ " "+noun()+" "+verb()+" the "+adjective()+" "+object());
     System.out.println("type y to go again: ");
      String input = scan.next();
      if(input.equals("y")){
          continue;
      }
       else{
           checker = false;
           return;
       }
        
      }//end while
    }//end main method
    public static String adjective(){
    String adjective;
    Random randomGenerator = new Random();
    int randomInt = randomGenerator.nextInt(9);
switch (randomInt){
    case 0: adjective = "small";
        break;
    case 1:  adjective = "large";
        break;
    case 2: adjective = "green";
        break;
    case 3: adjective = "minscule";
        break;   
    case 4: adjective = "tall";
        break;
    case 5: adjective = "short";
        break;
    case 6: adjective = "pretty";
        break;
    case 7: adjective = "brown";
        break;
    case 8: adjective = "blue";
        break;
    default: adjective = "red";
        break;
}
return adjective;
}//end adjective method
public static String noun(){
    String adjective;
    Random randomGenerator = new Random();
    int randomInt = randomGenerator.nextInt(9);
switch (randomInt){
    case 0: adjective = "cow";
        break;
    case 1:  adjective = "cat";
        break;
    case 2: adjective = "dog";
        break;
    case 3: adjective = "horse";
        break;   
    case 4: adjective = "fish";
        break;
    case 5: adjective = "turtle";
        break;
    case 6: adjective = "whale";
        break;
    case 7: adjective = "shark";
        break;
    case 8: adjective = "bird";
        break;
    default: adjective = "insect";
        break;
}
return adjective;
}//end noun method
public static String verb(){
    String adjective;
    Random randomGenerator = new Random();
    int randomInt = randomGenerator.nextInt(9);
switch (randomInt){
    case 0: adjective = "ate";
        break;
    case 1:  adjective = "jumped over";
        break;
    case 2: adjective = "ran past";
        break;
    case 3: adjective = "passed";
        break;   
    case 4: adjective = "fell on";
        break;
    case 5: adjective = "nudged";
        break;
    case 6: adjective = "saw";
        break;
    case 7: adjective = "noticed";
        break;
    case 8: adjective = "became";
        break;
    default: adjective = "observed";
        break;
}
return adjective;
}//end verb method
public static String object(){
    String adjective;
    Random randomGenerator = new Random();
    int randomInt = randomGenerator.nextInt(9);
switch (randomInt){
    case 0: adjective = "ball";
        break;
    case 1:  adjective = "tree";
        break;
    case 2: adjective = "stone";
        break;
    case 3: adjective = "diamond";
        break;   
    case 4: adjective = "pencil";
        break;
    case 5: adjective = "twig";
        break;
    case 6: adjective = "fruit";
        break;
    case 7: adjective = "branch";
        break;
    case 8: adjective = "flower";
        break;
    default: adjective = "paper";
        break;
}
return adjective;
}//end object method
    
}//end class