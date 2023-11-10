package week6;

public class Student08 {
    String name;
    int yearOfEnty, age;
    double GPA;

    public Student08(String n, int y, int a, double gpa){
        name=n;
        yearOfEnty=y;
        age=a;
        GPA=gpa;
    }

    public void dispStudent(){
        System.out.println("Name            : " +name);
        System.out.println("Year of Entry   : " +yearOfEnty);
        System.out.println("Age             : " +age);
        System.out.println("GPA             : " +GPA);
    }
}
