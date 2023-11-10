package week3;
import java.util.Scanner;

public class ArrayObjects08 {
    public static void main(String[] args) {
        Rectangle08 rtgArray[] = new Rectangle08[3];

        Scanner sc08 = new Scanner(System.in);

        for (int i = 0; i <3; i++){
            rtgArray[i] = new Rectangle08();
            System.out.println(i + "th Rectangle");
            System.out.print("Input length : ");
            rtgArray[i].length = sc08.nextInt();
            System.out.print("Input width : ");
            rtgArray[i].width = sc08.nextInt();
            System.out.println("========================");
        }
        
        for ( int i = 0; i<3; i++){
            System.out.println("=========output=========");
            System.out.println(i + "th Rectangle : ");
            System.out.println("length : " + rtgArray[i].length + " || width : " + rtgArray[i].width);
        }
    }
}
