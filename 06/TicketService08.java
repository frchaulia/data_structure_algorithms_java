package week6;
import java.util.Scanner;

public class TicketService08 {
    //Create a scanner object
    Scanner input = new Scanner(System.in);
    //Declaration Variable
    int x = input.nextInt();
    Ticket08 Ticket [] = new Ticket08 [x];
    int index;

    public void add(Ticket08 t){
        if (index<Ticket.length){
            Ticket[index]=t;
            index++;
        }
        else{
            System.out.println("Data is Full");
        }
    }
    public void display(){
        for (Ticket08 t : Ticket){
            t.dispTicket();
            System.out.println("==========================");
        }
    }
    public void bubbleSort(){
        for (int i=0; i<Ticket.length-1; i++){
            for(int j=0; j<Ticket.length-i-1;j++){
                if(Ticket[j].price<Ticket[j+1].price){
                    //Swapping Process
                    Ticket08 tmp = Ticket[j];
                    Ticket[j] = Ticket[j+1];
                    Ticket[j+1]=tmp;
                }
            }
        }
    }
    public void selectionSort(){
        for (int i=0; i<Ticket.length-1;i++){
            int indexMin=i;
            for(int j=i+1; j<Ticket.length; j++){
                if(Ticket[j].price<Ticket[indexMin].price){
                    indexMin=j;
                }
            }
            //Swapping process
            Ticket08 tmp = Ticket[indexMin];
            Ticket[indexMin] = Ticket[i];
            Ticket[i]=tmp;
        }
    }
}
