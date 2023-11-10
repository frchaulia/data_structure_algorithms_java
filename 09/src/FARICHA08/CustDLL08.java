package FARICHA08;

public class CustDLL08 {
    Customers08 head;
    int size;

    public CustDLL08(){
        head=null;
        size=0;
    }
    public boolean isEmpty(){
        return head==null;
    }

    public void addFirst(String name, int telp){
        if(isEmpty()){
            head=new Customers08(null, name, telp, null);

        }else{
            Customers08 newNode = new Customers08(null, name, telp, head);
            head.prev=newNode;
            head=newNode;
        }
        size++;
    }


    public void add(String name, int index, int telp){
        if(isEmpty()){
            addFirst(name,telp);
        }else if(index<0||index>size){
            return;
        }else{
            Customers08 current= head;
            int i=0;
            while(i<index){
                current=current.next;
                i++;
            }if(current.prev==null){
                Customers08 newNode= new Customers08(null, name, telp, current);
                current.prev=newNode;
                head=newNode;
            }else{
                Customers08 newNode=new Customers08(current.prev, name, telp, current);
                newNode.prev=current.prev;
                newNode.next=current;
                current.prev.next=newNode;
                current.prev=newNode;
            }
        }
        size++;
    }
}
