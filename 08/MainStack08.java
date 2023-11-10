package Practicum1;
import java.util.Scanner;

public class MainStack08 {
    Stack08 stk = new Stack08(5);
    Scanner sc08 = new Scanner(System.in);

    char choose;
    do {
        System.out.println("Type: ");
        String type = sc08.nextLine();
        System.out.println("Color: ");
        String color = sc08.nextLine();
        System.out.println("Brand: ");
        String brand = sc08.nextLine();
        System.out.println("Size: ");
        String size = sc08.nextLine();
        System.out.println("Price: ");
        double price = sc08.nextDouble();

        Clothes08 p = new Clothes08 (type, color, brand, size, price);
        System.out.println("Do You wanna add new Data to Stack (y/n)? ");
        choose = sc08.next().charAt(0);
        sc08.nextLine();
        stk.push(p);
    } while (choose == 'y');
    stk.print();
    stk.pop();
    stk.peek();
    stk.print();
}
