package week2;
import java.util.Scanner;
public class shopInput {
    
    String name;
    int unitPrice;
    int total;
    int calculateTotalPrice() {
        int total = unitPrice * total;
        return total;
    }
    int calculateDiscount() {
        int discount;
        if (calculateTotalPrice() > 100000) {
            discount = calculateTotalPrice() * 10 / 100;
        } else if (calculateTotalPrice() >= 50000 && calculateTotalPrice() <= 100000) {
            discount = calculateTotalPrice() * 5 / 100;
        } else {
            discount = 0;
        }
        return discount;
    }
    int calculatePricePaid() {
        return calculateTotalPrice() - calculateDiscount();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter item name  : ");
        String name = sc.nextLine();
        System.out.print("Enter unit price : ");
        int price = sc.nextInt();
        System.out.print("Enter total      : ");
        int total = sc.nextInt();       
        shopInput y1 = new shopInput();
        y1.name = name ;
        y1.unitPrice = price;
        y1.total = total;
       
        System.out.println("-------------------------------------------");
        System.out.println("Item Name        : " + y1.name);
        System.out.println("Total            : " + y1.total);
        System.out.println("Unit Price       : Rp." + y1.unitPrice);
        System.out.println("Discount         : Rp." + y1.calculateDiscount());
        System.out.println("Total pay        : Rp." + y1.calculatePricePaid());
    }
}
