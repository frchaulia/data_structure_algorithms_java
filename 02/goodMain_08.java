package week2;

public class goodMain_08 {
    public static void main(String[] args) {
        good_08 g1 = new good_08();
        g1.itemName="Corsair 8GB";
        g1.itemType="DDR";
        g1.unitPrice=250000;
        g1.stock=0;
        g1.addStock(1);
        g1.reduceStock(3);
        g1.showItem();
        int totalPrice=g1.calculateTotalPrice(4);
        System.out.println("Price for 4 item : " +totalPrice);

        good_08 g2 = new good_08("Logitech". "Mouse", 25, 150000);
        g2.showItem();

        good_08 g3 = new good_08("Asus". "Keyboard", 13, 350000);
        g3.showItem();
    }
}
