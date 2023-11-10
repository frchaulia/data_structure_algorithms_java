package week6;
import java.util.Scanner;

public class MainTicket08 {
    public static void main(String[] args) {
        //Create a scanner object
        Scanner input = new Scanner(System.in);
        TicketService08 data = new TicketService08();
        System.out.print("Enter the amount of data : "); int y = input.nextInt();

        Ticket08 total [] = new Ticket08 [y];

        for(int i=0; i<total.length; i++){
            String cA;
            String o;
            String d;
            int p;
            input.nextLine();
            System.out.println("Airline Company  : "); cA=input.nextLine();
            System.out.println("Origin           : "); o=input.nextLine();
            System.out.println("Destination      : "); d=input.nextLine();
            System.out.println("Ticket price     : "); p=input.nextInt();
            total[i] = new Ticket08(cA, o, d, p);
        }

        System.out.println("***** Unsorted Ticket Data *****");
        data.display();
        System.out.println("***** Sorted Ticket Data using Bubble Sort *****");
        data.bubbleSort();
        data.display();
        System.out.println("***** Sorted Ticket Data using Selection Sort *****");
        data.selectionSort();
        data.display();
    }
}
