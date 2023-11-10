package FARICHA08;

public class Customers08 {
    String name;
    int telp;
    Customers08 prev,next;

    Customers08(Customers08 prev, String name, int telp, Customers08 next){
        this.prev=prev;
        this.name=name;
        this.telp=telp;
        this.next=next;
    }
}
