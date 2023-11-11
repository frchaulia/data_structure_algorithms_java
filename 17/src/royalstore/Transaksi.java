package royalstore;

import java.util.LinkedList;

public class Transaksi {
	Produk p = new Produk();
	
	private int trans_id;
	private String prod_id;
	private int qty;
	int harga_total;
	
	String[] data = {};
	int[] tr_id = {};
	int[] qty2 = {};
	
	public Transaksi() {
		
	}
	public Transaksi(int trans_id,String prod_id, int qty) {
		this.prod_id=prod_id;
		this.qty=qty;
		this.trans_id=trans_id;
	}
	public int getTrans_id() {
		return trans_id;
	}
	public void setTrans_id(int trans_id) {
		this.trans_id = trans_id;
	}
	public String getProd_id() {
		return prod_id;
	}
	public void setProd_id(String prod_id) {
		this.prod_id = prod_id;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public int index(String prod_id) {
		int where=0;
		for(int i=0;i<p.prod_id.length;i++) {
			if(prod_id.equals(p.prod_id[i])) {
				where = i;
			}
		}
		return where;
	}
	
	
	public void add() {
		int j = data.length;
		if(data==null) {
			data[0] = prod_id;
			tr_id[0] = trans_id;
			qty2[0] = qty;
		}else {
			int index = j+1;
			data[index] = prod_id;
			tr_id[index] = trans_id;
			qty2[index] = qty;
		}
	}
	
}