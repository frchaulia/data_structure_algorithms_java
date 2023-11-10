package Practicum1;

public class Stack08 {
    int size, top;
        Clothes08 data[];
    
        public Stack08(int size){
            this.size = size;
            data = new Clothes08[size];
            top = -1;
        } 
    
        public boolean IsEmpty(){
            if (top == -1){
                return true;
            } else {
                return false;
            }
        }
    
        public boolean IsFull(){
            if (top == size -1){
                return true;
            } else {
                return false;
            }
        }
    
        public void push(Clothes08 clt){
            if (!IsFull()){
                top++;
                data[top] = clt;
            }else{
                System.out.println("Stack Is Full");
            }
        }
    
        public void pop(){
            if (!IsEmpty()){
                Clothes08 x = data[top];
                top--;
                System.out.println("\n Removed data: " + x.type + " " + x.color + " " + x.brand + " " + x.size + " " + x.price);
            } else {
                System.out.println("Stack Is Empty");
            }
        }
    
        public void peek() {
            System.out.println("\n Top Elements: " + data[top].type + " " + data[top].color + " " + data[top].brand + " " + data[top].size + " " + data[top].price);
        }
    
        public void print() {
            System.out.println("\n All Stack Element: ");
            for (int i = top; i >= 0; i--){
                System.out.println(data[i].type + " " + data[i].color + " " + data[i].brand + " " + data[i].size + " " + data[i].price);
            }
            System.out.println(" ");
        }
    
        public void clear(){
            if (!IsEmpty()){
                for (int i = top; i >= 0; i--){
                    top--;
                }
                System.out.println("All Data is Removed");
            } else {
            System.out.println("Stack is Empty");
            }
        }

        public void minPrice(){
            int min = 0;
            for (int i=0; i<data.length; i++){
                if (data[i].price<data[min].price){
                    min=i;
                }
            }
            System.out.println("Minimum price are: " +data[min]);
        }
}
