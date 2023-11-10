package week5;
import java.util.Scanner;

public class factorialMain08 {
    public static void main(String[] args) {

        Scanner sc08 = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("input number of elements : ");
        int numElement = sc08.nextInt();

        factorial08 fk[] = new factorial08[numElement];

        for (int i=0; i<fk.length; i++){
            fk[i]=new factorial08();
            System.out.println("input number " + (i+1) + " : ");
            fk[i].number=sc08.nextInt();
        }

        System.out.println("==============================");
        System.out.println("Factorial result using Brute Force");
        for (int i=0; i<fk.length; i++){
            System.out.println("Factorial of "+fk[i].number+" is : "+fk[i].factorialBF(fk[i].number));
        }
        System.out.println("==============================");
        System.out.println("Factorial result using Divide Conquer");
        for (int i=0; i<fk.length; i++){
            System.out.println("Factorial of "+fk[i].number+" is : "+fk[i].factorialDC(fk[i].number));
        }
        System.out.println("==============================");
    }
}
