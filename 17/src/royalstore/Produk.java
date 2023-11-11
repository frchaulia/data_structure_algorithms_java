package royalstore;


public class Produk {
	String[] prod_id = new String[] {"br01","br02","br03","br04"};
	String[] nama = new String[] {"Pasta Gigi","Almond Milk","Cocho Milk","LowFatMilk"};
	int[] harga = {12000,20000,30000,25000};
	int[] stok = {15,15,15,15};
	
	public void display() {
		System.out.println("++++++++++++++++++++++++");
		System.out.println("List Royal Product");
		System.out.println("++++++++++++++++++++++++");
		for(int i=0;i<prod_id.length;i++) {
			System.out.println("|"+prod_id[i]+"\t|"+nama[i]+"\t|"+harga[i]+"\t|"+stok[i]);
		}
		System.out.println("all product successfully printed");
	}
}
