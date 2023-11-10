package FARICHA08;

public class OrderDLL08 {
    Orders08 head;
    int size;

    public OrderDLL08(){
        head=null;
        size=0;
    }
    public boolean isEmpty(){
        return head==null;
    }

    public void addFirst(int orderId, String foodName, int price){
        if(isEmpty()){
            head=new Orders08(null, orderId, foodName,price, null);

        }else{
            Orders08 newNode = new Orders08(null,orderId, foodName,price, head);
            head.prev=newNode;
            head=newNode;
        }
        size++;
    }


    public void addOrder(int orderId, String foodName, int price, int index){
        if(isEmpty()){
            addFirst(orderId,foodName,price);
        }else if(index<0||index>size){
            return;
        }else{
            Orders08 current= head;
            int i=0;
            while(i<index){
                current=current.next;
                i++;
            }if(current.prev==null){
                Orders08 newNode= new Orders08(null, orderId, foodName,price, current);
                current.prev=newNode;
                head=newNode;
            }else{
                Orders08 newNode=new Orders08(current.prev, orderId, foodName,price, current);
                newNode.prev=current.prev;
                newNode.next=current;
                current.prev.next=newNode;
                current.prev=newNode;
            }
        }
        size++;
    }

    public void clear(){
        head=null;
        size=0;
    }

    public void print(){
        if(!isEmpty()){
            Orders08 tmp=head;
            while(tmp!=null){
                System.out.println("."+tmp.orderId);
                tmp=tmp.next;
            }
        }else{
            System.out.println("LInked list is empty");
        }
    }

    public void removeLast(){
        if(isEmpty()){
            System.out.println("Linked list is empty");
        } else if (head.next==null){
            head=null;
            size--;
            return;
        } else {
            Orders08 current = head;
            while(current.next.next!=null){
                current=current.next;
            }
            current.next=null;
            size--;
        }
    }

    public void removeFirst(){
        if(isEmpty()){
            System.out.println("Linked list is empty");
        } else if (size==1){
            removeLast();
        } else {
            head=head.next;
            head.prev=null;
            size--;
        }
    }

    public String getFirst(){
        if(isEmpty()){
            System.out.println("Linked list is empty");
            return null;
        } else {
            return head;
        }
    }

    public String getlast(){
        if(isEmpty()){
            System.out.println("Linked list is empty");
            return null;
        } else { 
            Orders08 tmp=head;
            while(tmp.next!=null){
                tmp=tmp.next;;
            }
            return tmp.orderId;
        }
    }

    public String get(int index){
        if(isEmpty() || index >= size){
            System.out.println("Linked list is empty or index out of bounds");
            return null;
        } else {
            Orders08 tmp=head;
            for(int i=0; i<index;i++){
                tmp=tmp.next;
            }
            return tmp.data;
        }
    }
}
