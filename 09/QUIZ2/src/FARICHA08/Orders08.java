package FARICHA08;

public class Orders08 {
    String foodName;
    int orderId;
    int price;
    Orders08 prev,next;

    Orders08(Orders08 prev, int orderId, String foodName, int price, Orders08 next){
        this.prev=prev;
        this.foodName=foodName;
        this.orderId=orderId;
        this.price=price;
        this.next=next;
    }
}
