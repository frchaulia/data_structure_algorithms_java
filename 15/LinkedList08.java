package J15;

public class LinkedList08 {
    Node08 head;
    Node08 tail;

    boolean isEmpty(){
        return (head == null);
    }

    public void print() {
        if (!isEmpty()) {
            Node08 tmp = head;
            System.out.println("Data on Linked List:\t");
            while (tmp != null) {
                System.out.println(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List is empty");
        }
    }

    public void addFirst(int input) {
        Node08 ndInput = new Node08(input, null);
        if (!isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            ndInput.next = head;
            head= ndInput;
        }
    }

    public void addLast(int input){
        Node08 ndInput = new Node08(input, null);
        if (isEmpty()){
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void insertAfter(int key, int input){
        Node08 ndInput = new Node08(input, null);
        Node08 temp = head;
        do {
            if(temp.data == key){
                ndInput.next = temp.next;
                temp.next = ndInput;
                if(ndInput.next == null) tail=ndInput;
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertAt(int index,int input){
        if(index<0){
            System.out.println("wrong index");
        } else if (index == 0){
            addFirst(input);
        } else {
            Node08 temp = head;
            for (int i=0; i<index-1; i++){
                temp = temp.next;
            }
            temp.next = new Node08(input, temp.next);
            if(temp.next.next==null){
                tail=temp.next;
            }
        }
    }

    public int getData (int index) {
        Node08 tmp = head;
        for (int i=0; i<index; i++){
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int indexOf (int key) {
        Node08 tmp = head;
        int index = 0;
        while (tmp != null && tmp.data != key){
            tmp = tmp.next;
            index++;
        }
        if (tmp == null){
            return -1;
        } else {
            return index;
        }
    }

    public void removeFirst() {
        if (isEmpty()){
            System.out.println("Linked list is empty, cannot delete data!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    public void removeLast(){
        if (isEmpty()){
            System.out.println("Linked list is empty, cannot delete data!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node08 temp = head;
            while (temp.next != tail){
                temp = temp.next;
            }
        }
    }

    public void remove (int key){
        if (isEmpty()){
            System.out.println("Linked List is empty, cannot delete data!");
        } else {
            Node08 temp = head;
            while (temp != null){
                if (temp.next==null){
                    System.out.println("data to be deleted was not found");
                    break;
                } else {
                    if ((temp.data == key) && (temp == head)){
                        this.removeFirst();
                        break;
                    }
                } temp = temp.next;
            }
        }
    }

    public void removeAt (int index){
        if(index == 0){
            removeFirst();
        } else {
            Node08 temp = head;
            for (int i=0; i<index-1; i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null){
                tail = temp;
            }
        }
    }
}
