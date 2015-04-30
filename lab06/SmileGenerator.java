//Evan Scott
//Smile Generator problem



public class SmileGenerator { 
    //main method
    public static void main(String[] args){
        int i;
        String smile = ":) "; // make a string so I don't have to put :) [space] every time
        
        //step 1
        for(i = 0; i<5; i++){
        System.out.print(smile);
        }
        System.out.println();
        i = 0;
        while(i <5){
            System.out.print(smile);
            i++;
        }
        i = 0;
        System.out.println();
        do{
            System.out.print(smile);
            i++;
        } while(i<5);
        System.out.println();
        System.out.println();
        //step 2
        int number = (int)(Math.random()*100 + 1);
        for(i = 0; i<number; i++){
            System.out.print(smile);
        }//end for loop
        System.out.println();
        System.out.println();
        //step 3
        for(i = 0; i<number; i++){
            if(i%30 == 0){
                System.out.println();
            }
            System.out.print(smile);
        }//end for loop
        System.out.println();
        //step 4
        i = 1;
        int j = 1;
        while(i<7){ //for 7 lines of increasing smiley faces
            System.out.print(smile);
            if(i == j){
                i = 0;
                j++;
                System.out.println();
            }
            if(i == 6){
                System.out.print(smile);
            }
            i++;
        }//end while
        System.out.println();
    }
}