package COLLECTION08;

public class ListMahasiswa08 {
    ListMahasiswa08 lm = new ListMahasiswa08();
    Student08 m = new Student08("201234", "Noureen", "021xx1");
    Student08 m1 = new Student08("201235", "Akhleema", "021xx2");
    Student08 m2 = new Student08("201236", "Shannum", "021xx3");
    lm.adds(m,m1,m2);
    lm.display();
    lm.update(lm.linearSearch("201235"), new Student08("201235","Akhleema Lela","021xx2"));
    System.out.println("");
    lm.display();
}
