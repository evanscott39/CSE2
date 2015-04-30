//Evan Scott
//lab 13 April 30 2015
import java.util.Arrays;
public class RaggedArrays{
    public static void main(String[] args){
        
        int[][] array = new int[5][];
        int i;
        int j;
        
        for(i = 0; i<5; i++){
            array[i] = new int[i*3 + 5];
        }
        
        for(i = 0; i<5; i++){
            for(j = 0; j<array[i].length; j++){
                array[i][j] = (int) (Math.random()*40);
            }//end nested for 
        }// end outside for 
        
        for(i = 0; i<5; i++){
            System.out.print("row "+(i+1)+":");
            for( j = 0; j<array[i].length; j++){
                System.out.print(" "+array[i][j]);
            }//end nested for 
            System.out.println();
        }// end outside for 
        
        for(i = 0; i<5; i++){
            Arrays.sort(array[i]);
        }System.out.println();
        System.out.println("array after sorting:");
        
        for(i = 0; i<5; i++){
            System.out.print("row "+(i+1)+":");
            for( j = 0; j<array[i].length; j++){
                System.out.print(" "+array[i][j]);
            }//end nested for 
            System.out.println();
        }// end outside for 
        
        int[][] newArray = new int[5][17];
        for(i = 0; i<5; i++){
            for(j = 0; j<array[i].length; j++){
                newArray[i][j] = array[i][j];
            } // end nested for
        } //end outside for
        System.out.println();
        for(i = 0; i<5; i++){
            System.out.print("row "+(i+1)+":");
            for(j = 0; j<17; j++){
                System.out.print(" "+newArray[i][j]);
            }//end nested for 
            System.out.println();
        }// end outside for 
    }
}