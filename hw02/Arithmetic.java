//Evan Scott
//February 3 2015
//CSE 002 hw02

public class Arithmetic{
    
    public static void main(String [] args){
        //Number of pairs of socks
        int nSocks=3;
        //Cost per pair of socks
        //(‘$’ is part of the variable name)
        double sockCost$=2.58;

        //Number of drinking glasses
        int nGlasses=6;
        //Cost per glass
        double glassCost$=2.29;

        //Number of boxes of envelopes
        int nEnvelopes=1;
        //cost per box of envelopes
        double envelopeCost$=3.25;
        double taxPercent=0.06;
        
        double totalSockCost$=nSocks*sockCost$;   //total cost of socks
        double sTax$=totalSockCost$*taxPercent; //cost of tax on socks
        double socksWithTax$=sTax$+totalSockCost$; // overall cost of socks with tax
        
        double totalEnvelopeCost$=nEnvelopes*envelopeCost$;   //total cost of socks
        double eTax$=totalEnvelopeCost$*taxPercent; //cost of tax on socks
        double envelopeWithTax$=eTax$+totalEnvelopeCost$; // overall cost of socks with tax
        
        double totalGlassCost$=nGlasses*glassCost$; //total cost of glasses
        double gTax$=totalGlassCost$*taxPercent;  // glasses tax
        double glassesWithTax$=gTax$+totalGlassCost$; // total cost with tax
        
        double totalNoTax=totalGlassCost$+totalSockCost$+totalEnvelopeCost$; //total cost of all 3, no tax
        double totalTax=gTax$+sTax$+eTax$; // total tax of all 3
        double totalWithTax=totalNoTax+totalTax;
        
        
        
        double totalNoTax1$=totalNoTax*100; //change the total cost no tax to an integer and back to get 2 decimal places
        int noTaxInt= (int) totalNoTax1$;
        double noTaxDouble= (double) noTaxInt;
        double noTaxFinal=noTaxDouble/100;
        
        double totalTax1=totalTax*100; //change total tax to an integer and back to get 2 decimal places
        int totalTaxInt= (int) totalTax1;
        double totalTaxDouble= (double) totalTaxInt;
        double totalTaxFinal=totalTaxDouble/100;
        
        double totalWithTax1=totalWithTax*100; //change total with tax to an integer and back to get 2 decimal places
        int totalWithInt= (int) totalWithTax1;
        double totalWithDouble= (double) totalWithInt;
        double totalWithTaxFinal=totalWithDouble/100;
        
        double sTax1=sTax$*100; //change sTax to an integer and back to get 2 decimal places
        int sTaxInt= (int) sTax1;
        double sTaxDoub= (double) sTaxInt;
        double sTaxFinal=sTaxDoub/100;
        
        double gTax1=gTax$*100; //change gTax to an integer and back to get 2 decimal places
        int gTaxInt= (int) gTax1;
        double gTaxDoub= (double) gTaxInt;
        double gTaxFinal=gTaxDoub/100;
        
        double eTax1=eTax$*100; //change eTax to an integer and back to get 2 decimal places
        int eTaxInt= (int) eTax1;
        double eTaxDoub= (double) eTaxInt;
        double eTaxFinal=eTaxDoub/100;
        
         double sWtTax1=socksWithTax$*100; //change socks with tax to an integer and back to get 2 decimal places
        int sWtTaxInt= (int) sWtTax1;
        double sWtTaxDouble= (double) sWtTaxInt;
        double sWtTaxFinal=sWtTaxDouble/100;
        
        double gWtTax1=glassesWithTax$*100; //change glasses with tax to an integer and back to get 2 decimal places
        int gWtTaxInt= (int) gWtTax1;
        double gWtTaxDouble= (double) gWtTaxInt;
        double gWtTaxFinal=gWtTaxDouble/100;
        
        double eWtTax1=envelopeWithTax$*100; //change envelopes with tax to an integer and back to get 2 decimal places
        int eWtTaxInt= (int) eWtTax1;
        double eWtTaxDouble= (double) eWtTaxInt;
        double eWtTaxFinal=eWtTaxDouble/100;
        
        System.out.println("Number of socks bought= "+nSocks); //good
        System.out.println("Number of glasses bought= "+nGlasses); //good
        System.out.println("Number of envelopes bought= "+nEnvelopes);//good
        
        System.out.println("Cost per socks = $"+sockCost$);//good
        System.out.println("Cost per glasses = $"+glassCost$);//good
        System.out.println("Cost per envelope = $"+envelopeCost$);//good
        
        System.out.println("Cost of all the socks = $"+totalSockCost$);//good
        System.out.println("Cost of all the glasses = $"+totalGlassCost$);//good
        System.out.println("Cost of all the envelopes = $"+totalEnvelopeCost$); //automatically 2 decimals, all good
        
        System.out.println("Sales tax all the socks = $"+sTaxFinal);
        System.out.println("Sales tax all the glasses = $"+gTaxFinal);
        System.out.println("Sales tax all the envelopes = $"+eTaxFinal);
        
        System.out.println("Total cost of socks including tax = $"+sWtTaxFinal);
        System.out.println("Total cost of glasses including tax = $"+gWtTaxFinal);
        System.out.println("Total cost of envelopes including tax = $"+eWtTaxFinal);
        
        System.out.println("Total cost of all purchases no tax = $"+noTaxFinal);  //good
        System.out.println("Total tax on all purchases = $"+totalTaxFinal);  //good
        System.out.println("Total cost of all purchases including tax = $"+totalWithTaxFinal); //good
        
        
    }
}
