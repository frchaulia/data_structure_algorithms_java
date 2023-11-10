package week6;

public class MainStudent08 {
    public static void main(String[] args) {
        studentAchievList08 list = new studentAchievList08();
        Student08 s1 = new Student08 ("Nusa", 2017, 25, 3);
        Student08 s2 = new Student08 ("Rara", 2012, 19, 4);
        Student08 s3 = new Student08 ("Ani", 2018, 19, 3.5);
        Student08 s4 = new Student08 ("Abdul", 2017, 23, 2);
        Student08 s5 = new Student08 ("Ummi", 2019, 21, 3.75);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        System.out.println("***** Unsorted Student08 Data *****");
        list.display();

        System.out.println("***** Sorted Student Data based on GPA score *****");
        list.bubbleSort();
        list.display();

        System.out.println("***** ASC Order Sorted Student Data based on GPA score using SelectionSort Algorithm *****");
        list.selectionSort();
        list.display();

        System.out.println("***** ASC Order Sorted Student Data based on GPA score using InsertionSort Algorithm *****");
        list.insertionSort();
        list.display();
    }   
}