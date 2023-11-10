import java.util.Scanner;
public class JS1ASD3 {
    public static void main(String []args){
        //Task 2.4.1 Lab unit 3 : Array
		System.out.println ("\t");
		System.out.println ("*****************************");
		System.out.println ("2.4.1 Lab unit 3 : Array");		
        System.out.println ("*****************************");
		System.out.println ("\t");
		//Declaration Variable
        Scanner sc = new Scanner(System.in);
        int aglonema = 0;
        int caladium = 0;
        int alocasia = 0;
        int rose = 0;
        int x,y;
        int supply[][] = {{10,5,15,17},{6,11,9,12},{2,10,10,5},{5,7,12,9}};
        //Array
        System.out.println("ROYAL GARDEN DATA");
        System.out.println("=================================");
        for (x=0; x<supply[0].length; x++) {
            for (y=0; y<supply[0].length; y++) {
                System.out.print("   " + supply[x][y] +  "\t" + "|");
            }
            System.out.println("\t");
            System.out.println("=================================");
        }
        System.out.println("Total supply based on the type of flowers in all branches");
        System.out.println("=================================");
        for (x=0; x<supply[0].length; x++) {
            aglonema += supply[x][0];
            caladium += supply[x][1];
            alocasia += supply[x][2];
            rose += supply[x][3];
        }
        System.out.println(" Aglonema = " + aglonema);
        System.out.println(" Caladium = " + caladium);
        System.out.println(" Alocasia = " + alocasia);
        System.out.println(" Rose     = " + rose);
        System.out.println("=================================");
        System.out.println("Update supply on Royal Garden 1");
        supply[0][0] = supply[0][0] - 1;
        supply[0][1] = supply[0][1] - 2;
        supply[0][3] = supply[0][3] - 5;
        System.out.println("=================================");
        System.out.println(" Aglonema = " + supply[0][0]);
        System.out.println(" Caladium = " + supply[0][1]);
        System.out.println(" Alocasia = " + supply[0][2]);
        System.out.println(" Rose     = " + supply[0][3]);
        System.out.println("=================================");
        int totalIncome = (supply[0][0]*75000) + (supply[0][1]*50000) + (supply[0][2]*60000) + (supply[0][3]*10000);
        System.out.println("Total income from Ryl Gard 1 after supply reduction = Rp. " + totalIncome);
        System.out.println("=================================================================");

    }    
}
