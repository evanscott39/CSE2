
//importing java scanner:
import java.util.Scanner;

public class test {
    public static void main(String[] arg){
    int[] i = new int [3];
    fillI(i);
    printI(i);
    
    }
    
   static void fillI(int[] i){
        for(int j =0;j<i.length;j++){
            i[j] = j;
        }
    }
    static void printI(int[] i){
        System.out.println(i[2]);
    }
}