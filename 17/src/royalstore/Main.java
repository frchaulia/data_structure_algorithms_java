package royalstore;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Produk produk = new Produk();
	Transaksi tr = new Transaksi();
	Scanner sc = new Scanner(System.in);
	int pil=1;
	int i=0,qty;
	String prod_id;
	do{
		System.out.println("=====================================\nRoyal Store System\nMenu");
		System.out.println("1. List Product Menu");
		System.out.println("2. Add Transaction");
		System.out.println("3. Print All Transaction");
		System.out.println("4. Sort Transaction by Product Name");
		System.out.println("5. Exit");
		pil = sc.nextInt();
		sc.nextLine();
		if(pil==1) {
			produk.display();
		}else if(pil==2) {
			System.out.println("--------------------------");
			System.out.println("Input Transaction Data");
			System.out.println("--------------------------\n");
			System.out.println("Transaciton Id: "+i+1);
			System.out.print("Product Id: ");prod_id=sc.nextLine();
			tr.setProd_id(prod_id);
			System.out.print("Quantity = ");qty=sc.nextInt();
			System.out.println("Remaining Stock = "+(produk.stok[tr.index(prod_id)]-qty));
			sc.nextLine();
			System.out.println("|"+(i+1)+"\t|"+qty+"\t|"+produk.nama[tr.index(prod_id)]+"\t|"+produk.harga[tr.index(prod_id)]+"\t|"+(produk.harga[tr.index(prod_id)]*qty));
			i=i+1;
		}else if(pil==3) {
			
		}else if(pil==4) {
			
		}else if(pil==5) {
			
		}else {
			System.out.print("Pilihan Salah\n\n");
		}
	}while(pil!=5);
	}
}
