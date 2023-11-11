package LinkedListPracticum;

public class MainSLL08 {
    public static void main(String[] args) {
        SingleLinkedList08 singLL1 = new SingleLinkedList08();

        singLL1.print();
        singLL1.addFirst(89);
        singLL1.print();
        singLL1.addLast(76);
        singLL1.print();
        singLL1.addFirst(70);
        singLL1.print();
        singLL1.insertAfter(70, 99);
        singLL1.print();
        singLL1.insertAt(3, 83);
        singLL1.print();

        System.out.println("indeks 1 data = " +singLL1.getData(1));
        System.out.println("Data with value = 76 in the index : " + singLL1.indexOf(76));

        singLL1.remove(990);
        singLL1.print();
        singLL1.remove(99);
        singLL1.print();
        singLL1.removeAt(0);
        singLL1.print();
        singLL1.removeFirst();
        singLL1.print();
        singLL1.removeLast();
        singLL1.print();
        
    }
}
