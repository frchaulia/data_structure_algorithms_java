package week3exercise;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String[] name = new String[50];
		String[] gender = new String[50];
		int[] nim = new int[50];
		double[] value = new double[50];
		int i,j;
		int totStud,nim2;
		double gpa;
		String nameInput="",genderInput="";
		System.out.print("How Many Students: ");
		totStud = sc.nextInt();
		sc.nextLine();
		System.out.println("==================");
		for(i=0;i<totStud;i++) {
			System.out.println((i+1)+"th Student:");
			System.out.print("Input Name  : ");nameInput=sc.nextLine();
			System.out.print("Input NIM   : ");nim2=sc.nextInt();
			System.out.print("Input Gender: ");genderInput=sc.next();
			System.out.print("Input GPA   : ");gpa=sc.nextDouble();
			name[i] = nameInput;
			nim[i] = nim2;
			gender[i] = genderInput;
			value[i] = gpa;
			sc.nextLine();
			System.out.println();
		}
		System.out.println("=============OUTPUT=============");
		for(j=0;j<totStud;j++) {
			System.out.println("Name      : "+name[j]);
			System.out.println("NIM       : "+nim[j]);
			System.out.println("Gender    : "+gender[j]);
			System.out.println("GPA Score : "+value[j]);
		}
	}
    }
}
