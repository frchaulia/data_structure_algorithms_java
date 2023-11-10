package week7;
import java.util.Scanner;

public class StudentMain08 {
    public static void main(String[]args){
        Scanner scInt = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);

        StudentSearch08 data = new StudentSearch08();
        int Std = 5;
        System.out.println("===================================");
        System.out.println("Input Student Data Ascending Order based on NIM");
        for(int i=0;i<Std;i++){
            System.out.println("===================================");
            System.out.println("NIM\t : ");
            int nim=scInt.nextInt();
            System.out.println("Name\t : ");
            int name=scInt.nextInt();
            System.out.println("Age\t : ");
            int age=scInt.nextInt();
            System.out.println("GPA\t : ");
            int gpa=scInt.nextInt();

            Student08 s = new Student08 (nim, name,age,gpa);
            data.addStudent(s);
        }
        
    System.out.println("===================================");
    System.out.println("All Student Data");
    data.display();

    System.out.println("===================================");
    System.out.println("Search data");
    System.out.println("Input NIM you are looking for");
    System.out.print("NIM");
    int key = scInt.nextInt();

    System.out.print("Using sequential search algorithm");
    int position = data.FindSeqSearch(key);
    }
}
