package FARICHA08;
import java.util.Scanner;

public class RestoMain08 {
    public static void menu(){
        System.out.println("=======================");
        System.out.println("Clea Restaurant Queuing System");
        System.out.println("=======================");
        System.out.println("1. Add queue");
        System.out.println("2. Print queue");
        System.out.println("3. Delete queue");
        System.out.println("4. Report sort by ID");
        System.out.println("5. Print total income");
        System.out.println("6. Exit");
        System.out.println("=======================");
    }

    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);
        CustDLL08 dll= new CustDLL08();
        OrderDLL08 dllO = new OrderDLL08();
        int index;
        int choose;
        do{
            menu();
            choose=input08.nextInt();
            switch(choose){
                case 1:
                    System.out.println("Queue number: ");
                    index=input08.nextInt();
                    input08.nextLine();
                    System.out.println("Customer's name: ");
                    System.out.println("Customer's telp number: ");
                    String name=input08.nextLine();
                    int telp=input08.nextInt();
                    dll.add(name,index,telp);
                    dll.add(name,index,telp);

                break;
                case 2:
                    System.out.println("Waiting Queue List");
                    dllO.print();
                    System.out.println("Size : "+dll.size);
                break;
                case 3:
                    int pos=1;
                    System.out.println( dllO.get(pos)+ " has ordered food");
                    dllO.removeFirst();
                    System.out.println("Size : "+dll.size);
                    dllO.get(index);
                    System.out.println("Order Id: ");
                    System.out.println("FoodName: ");
                    System.out.println("Price: ");
                    int orderId=input08.nextInt();
                    String foodName=input08.nextLine();
                    int price=input08.nextInt();
                    dllO.addOrder(orderId,foodName,price,index);
                    dllO.addOrder(orderId,foodName,price,index);
                    dllO.addOrder(orderId,foodName,price,index);
                break;
                case 4:
                    
                break;
                case 5:
                    
                break;
            } 
            while(choose==1||choose==2||choose==3||choose==4||choose==5);
            input08.close();
        }
    }
}
