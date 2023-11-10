package week2;

public class good_08 {
    String itemName, itemType;
    int stock, unitPrice;

    void showItem(){
        System.out.println("Name        : " +itemName);
        System.out.println("Type        : " +itemType);
        System.out.println("Stock       : " +stock);
        System.out.println("Unit Price  : " +unitPrice);
    }

    void addStock(int n){
        stock = stock + n;
    }

    void reduceStock(int n){
        stock = n;
        n >= 0;
    }

    int calculateTotalPrice(int qty){
        return qty*unitPrice;
    }

}
