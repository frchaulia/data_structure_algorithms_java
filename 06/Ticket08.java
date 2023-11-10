package week6;

public class Ticket08 {
    String compAirlines;
    String origin;
    String destination;
    int price;

    public Ticket08(String cA, String o, String d, int p){
        compAirlines=cA;
        origin=o;
        destination=d;
        price=p;
    }

    public void dispTicket(){
        System.out.println("Company Airlines: "+compAirlines);
        System.out.println("Origin          : "+origin);
        System.out.println("Destination     : "+destination);
        System.out.println("Price           : "+price);
    }
