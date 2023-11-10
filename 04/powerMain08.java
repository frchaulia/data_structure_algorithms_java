package week5;
import java.util.Scanner;
public class powerMain08 {
    public static void main(String[] args) {
        Scanner sc08 = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("input number of elements : ");
        int numElement = sc08.nextInt();

        power08 pw[] = new power08[numElement];

        for(int i=0; i<pw.length; i++){
            pw[i]=new power08();
            System.out.println("input base number " + (i+1) + " : ");
            pw[i].base=sc08.nextInt();
            System.out.println("input exponent number " + (i+1) + " : ");
            pw[i].exponent=sc08.nextInt();
        }

        System.out.println("==============================");
        System.out.println("Power result using Brute Force");
        for (int i=0; i<pw.length; i++){
            System.out.println("Power of "+pw[i].base+" is : "+pw[i].powerBF(pw[i].base, pw[i].exponent));
        }
        System.out.println("==============================");
        System.out.println("Power result using Divide Conquer");
        for (int i=0; i<pw.length; i++){
            System.out.println("Power of "+pw[i].base+" is : "+pw[i].powerBF(pw[i].base, pw[i].exponent));
        }
        System.out.println("==============================");
    }
    
}
