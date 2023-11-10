package week5;
import java.util.Scanner;

public class mainSum08 {
    public static void main(String[] args) {
        Scanner sc08 = new Scanner(System.in);
        System.out.println("==============================");
        System.out.println("Program to calculate profit of company (units in million, ex:8 milllions");
        System.out.println("input number of months : ");
        int numMonth = sc08.nextInt();

        sum08 sm=new sum08(numMonth);
        System.out.println("==============================");
        for(int i=0; i<numMonth; i++){
            System.out.println("input profit for month " +(i=1)+ " : ");
            sm.profit[i]=sc08.nextDouble();
        }

        System.out.println("==============================");
        System.out.println("Sum of profit using Brute force");
        System.out.println("sum of profit : " + sm.totalBF(sm.profit));

        System.out.println("==============================");
        System.out.println("Sum of profit using Divide Conquer");
        System.out.println("sum of profit : " + sm.totalDC(sm.profit,0,numMonth-1));
    }
}
