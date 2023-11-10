package week7;

public class Student08 {
    int nim;
    String name;
    int age;
    double GPA;

    Student08(int n, String na, int a, double g){
        nim=n;
        name=na;
        age=a;
        GPA=g;
    }

    void dispStudent(){
        System.out.println("NIM  : " +nim);
        System.out.println("Name : " +name);
        System.out.println("Age  : " +age);
        System.out.println("GPA  : " +GPA);
    }
}
