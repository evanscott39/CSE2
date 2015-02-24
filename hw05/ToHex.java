//Evan Scott
//February 24 2015
//Decimal to Hex Problem
import java.util.Scanner;

public class ToHex { 
    //main method
    public static void main(String[] args){
      
      Scanner scan;
    scan=new Scanner(System.in);
    
    System.out.print("Please enter three numbers representing RGB values: ");
    int red =1;
    int green = 1;
    int blue = 1;
    
    if (scan.hasNextInt()) {
        red = scan.nextInt();
    }
    else{
        System.out.println("You did not enter an integer");
        return;
    }
    
    if (scan.hasNextInt()){
        green = scan.nextInt();
    }
    else{
        System.out.println("You did not enter an integer");
        return;
    }
    
    if (scan.hasNextInt()) {
        blue = scan.nextInt();
    }
    else{
        System.out.println("You did not enter an integer");
        return;
    }
    String r1String = "0";
    String r2String = "0";
    String g1String = "0";
    String g2String = "0";
    String b1String = "0";
    String b2String = "0"; //initialized values for the letter strings
    
    if (red >255 || green>255 || blue>255 ) {
        System.out.println("Sorry, you must enter values between 0-255");
        return;
    }//end if
    else if (red<0 || green<0 || blue<0){
        System.out.println("Sorry, you must enter values between 0-255");
        return;
    }//end elseif
    
    
    
    //========= red conversion =======
    int rFirstNum = red/16;
    int rSecondNum = red % 16;
    
    switch (rFirstNum) {//begin r1 switch
        case 10:
            r1String = "A";
        break;
        case 11:
            r1String = "B";
        break;
        case 12:
            r1String = "C";
        break;
        case 13:
            r1String = "D";
        break;
        case 14:
            r1String = "E";
        break;
        case 15:
            r1String = "F";
        break;
        default:
            r1String = Integer.toString(rFirstNum);
    } //end r1 switch
        
    switch (rSecondNum) {//begin r2 switch
        case 10:
            r2String = "A";
        break;
        case 11:
            r2String = "B";
        break;
        case 12:
            r2String = "C";
        break;
        case 13:
            r2String = "D";
        break;
        case 14:
            r2String = "E";
        break;
        case 15:
            r2String = "F";
        break;
        default:
            r2String = Integer.toString(rSecondNum);
    } //end r2 switch
    
    //======== green conversion =======
    int gFirstNum = green/16;
    int gSecondNum = green % 16;
    
    
    switch (gFirstNum) {//begin g1 switch
        case 10:
            g1String = "A";
        break;
        case 11:
            g1String = "B";
        break;
        case 12:
            g1String = "C";
        break;
        case 13:
            g1String = "D";
        break;
        case 14:
            g1String = "E";
        break;
        case 15:
            g1String = "F";
        break;
        default:
            g1String = Integer.toString(gFirstNum);
            
        
    } //end g1 switch
    
    switch (gSecondNum) {//begin g2 switch
        case 10:
            g2String = "A";
        break;
        case 11:
            g2String = "B";
        break;
        case 12:
            g2String = "C";
        break;
        case 13:
            g2String = "D";
        break;
        case 14:
            g2String = "E";
        break;
        case 15:
            g2String = "F";
        break;
        default:
            g2String = Integer.toString(gSecondNum);
            
        
    } //end g2 switch
    
    //======blue conversion =======
    
    int bFirstNum = blue/16;
    int bSecondNum = blue % 16;
    
    switch (bFirstNum) {//begin r1 switch
        case 10:
            b1String = "A";
        break;
        case 11:
            b1String = "B";
        break;
        case 12:
            b1String = "C";
        break;
        case 13:
            b1String = "D";
        break;
        case 14:
            b1String = "E";
        break;
        case 15:
            b1String = "F";
        break;
        default:
            b1String = Integer.toString(bFirstNum);
            
        
    } //end b1 switch
    
        switch (bSecondNum) {//begin r1 switch
        case 10:
            b2String = "A";
        break;
        case 11:
            b2String = "B";
        break;
        case 12:
            b2String = "C";
        break;
        case 13:
            b2String = "D";
        break;
        case 14:
            b2String = "E";
        break;
        case 15:
            b2String = "F";
        break;
        default:
            b2String = Integer.toString(bSecondNum);
            
        
    } //end b2 switch
    
    System.out.print("The decimal numbers R:" +red+ ", G:" +green+ ", B:" +blue+ ", is represented in hexadecimal as: ");
    System.out.println(r1String+r2String+g1String+g2String+b1String+b2String);

    } // end main method
    
} // end class