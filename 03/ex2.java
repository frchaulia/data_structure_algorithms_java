package week3exercise;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int[] area = new int[50];
		int total,i,j;
		int wide,length;
		int max = area[0];
		System.out.print("How Many Land: ");
		total =sc.nextInt();
		System.out.println("================");
		for(i=0;i<total;i++) {
			System.out.println(i+"th land:");
			System.out.print("Input Length : ");
			wide = sc.nextInt();
			System.out.print("Input Width  : ");
			length = sc.nextInt();
			area[i]=wide*length;
			System.out.println();
		}
		System.out.println("================");
		for(j=0;j<total;j++) {
			System.out.println("area of "+j+"th land: "+area[j]);
		}
		System.out.println("================");
		for (i = 0; i < total; i++) {
			if (area[i] > max) {
            	max = area[i];
            }
		}
		System.out.println("Maximal Area: "+max);
    }
    
}
