package Exercise2;

public class Main08 {
    Item08 item = new Item08();
    item.setNamaBarang("");
    item.setJumlahBarang(1);
    item.setTotalBarang(new BigDecimal(200));
    
    List<Item08> newListItem = new ArrayList<>();
    newListItem.add(item);

    Receipt08 receipt = new Receipt08();
    receipt.setItemPembelian(newListItem);
    // ...
    
    Stack<Receipt08> stack = new Stack<>();
    stack.push(receipt);

    stack.pop();
}
