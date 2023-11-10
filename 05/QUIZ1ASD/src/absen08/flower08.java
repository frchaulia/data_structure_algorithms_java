package absen08;
import java.util.Scanner;

public class flower08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String[] name = new String[50];
		int[] stock = new int[50];
		int[] price = new int[50];
		String pil;
		int n,i,choose;
		System.out.print("How Many Flowers: ");n=sc.nextInt();
		System.out.println("===================");
		do {
		System.out.println("=======RoyalGarden Flower Shop=======");
		System.out.println("Menu: \n1. Input Flower Data\n2. Display Flower Data\n3. Update Flower Stock"
				+ "\n4. Total Stock Of Flowers\n5. Exit");
		System.out.print("Select Menu: ");choose=sc.nextInt();
		System.out.println("===================");
		
			switch(choose) {
			case 1:
				for(i=0;i<n;i++) {
					sc.nextLine();
					System.out.println((i+1)+"th Flower:");
					System.out.print("Input Flower Name  : ");name[i]=sc.nextLine();
					System.out.print("Input Stock        : ");stock[i]=sc.nextInt();
					System.out.print("Input Price        : ");price[i]=sc.nextInt();
					System.out.println("==================");
					sc.nextLine();
				}
				System.out.print("Go back to menu?(y/n)");pil=sc.nextLine();
				if(pil.equals("Y") || pil.equals("y")) {
					
				}else {
					System.exit(0);
				}
				break;
			case 2:
				for(i=0;i<n;i++) {
					sc.nextLine();
					System.out.println((i+1)+"th Flower:");
					System.out.println("Flower Name  : "+name[i]);
					System.out.println("Stock        : "+stock[i]);
					System.out.println("Price        : "+price[i]);
					System.out.println("==================");
				}
				System.out.print("Go back to menu?(y/n)");pil=sc.nextLine();
				if(pil.equals("Y") || pil.equals("y")) {
					
				}else {
					System.exit(0);
				}
				break;
			case 3:
				int pilih,stockadd;
				System.out.print("1. Add Stock\n2. Reduce Stock\nSelect: ");pilih=sc.nextInt();
				if(pilih==1) {
					for(i=0;i<n;i++) {
						sc.nextLine();
						System.out.println((i+1)+"th Flower:");
						System.out.println("Flower Name  : "+name[i]);
						System.out.print("Input New Stock: ");stockadd=sc.nextInt();
						stock[i] = stock[i]+stockadd;
					}
				}else {
					for(i=0;i<n;i++) {
						sc.nextLine();
						System.out.println((i+1)+"th Flower:");
						System.out.println("Flower Name  : "+name[i]);
						System.out.print("Input New Stock: ");stockadd=sc.nextInt();
						stock[i] = stock[i]-stockadd;
					}
				}
				System.out.println("============All Data=============");
				for(i=0;i<n;i++) {
					System.out.println((i+1)+"th Flower:");
					System.out.println("Flower Name  : "+name[i]);
					System.out.println("Stock        : "+stock[i]);
					System.out.println("Price        : "+price[i]);
					System.out.println("==================");
				}
				System.out.print("Go back to menu?(y/n)");pil=sc.nextLine();
				if(pil.equals("Y") || pil.equals("y")) {
					
				}else {
					System.exit(0);
				}
				break;
			case 4:
				int sum=0;
				for(i=0;i<n;i++) {
					sum = sum+stock[i];
				}
				System.out.print("Sum of Stock: "+sum);
				System.out.print("Go back to menu?(y/n)");pil=sc.nextLine();
				if(pil.equals("Y") || pil.equals("y")) {
					
				}else {
					System.exit(0);
				}
				break;
			default:
				System.out.print("Sorry, wrong input");
				break;
			}
		}while(choose!=5);
	}
}
