package COLLECTION08;

import java.util.LinkedList;

public class ExampleList08 {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(1);
        l.add(1);
        l.add(1);
        l.add("Meatball");
        System.out.println("Element 0: %d, total element: %d the last element: %s\n",l.get(0),l.size(),l.get(l.size()-1)+"\n");
        l.add(4);
        l.remove(0);
        System.out.println("Element 0: %d, total element: %d the last element: %s\n",l.get(0),l.size(),l.get(l.size()-1)+"\n");

        LinkedList<String> names = new LinkedList<>();
        names.add("Noureen");
        names.add("Akhleema");
        names.add("Shannum");
        names.add("Uwais");
        names.add("Al-Qarni");
        System.out.println("Element 0: %d, total element: %s the last element: %s\n",l.get(0),l.size(),l.get(l.size()-1)+"\n");
        names.set(0, "My kid");
        System.out.println("Element 0: %d, total element: %d the last element: %s\n",l.get(0),l.size(),l.get(l.size()-1)+"\n");
        System.out.println("Names: " + names.toString()+"\n");
    }
}