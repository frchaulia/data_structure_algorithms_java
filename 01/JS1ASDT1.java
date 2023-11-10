import java.util.Scanner;
public class JS1ASDT1 {
    public static void main(String[] args) {
        //Task 3.1 
		System.out.println ("\t");
		System.out.println ("**********************************");
		System.out.println ("Task 3.1 Program Laundry Services");		
        System.out.println ("**********************************");
		System.out.println ("\t");
		//Declaration Variable
        Scanner sc = new Scanner(System.in);
        int ani = 4;
        int budi = 15;
        int bina = 6;
        int cita = 11;
        int totalAni, totalBudi, totalBina, totalCita, total;
        int discountBudi, discountCita;
        System.out.println("Smile Laundry Customers : ");
        System.out.println("==================================");
        System.out.println("1. Ani  4 -  Kg");
        totalAni = 4 * 4500;
        System.out.println("2. Budi 15 - Kg");
        discountBudi = 15 * 4500 * (5 / 100);
        totalBudi = 15 * 4500 - discountBudi;
        System.out.println("3. Bina 6  - Kg");
        totalBina = 6 * 4500;
        System.out.println("4. Cita 11 - Kg");
        discountCita = 11 * 4500 * (5 / 100);
        totalCita = 11 * 4500 - discountCita;
        total = totalAni + totalBudi + totalBina + totalCita ;
        System.out.println("==================================");
        System.out.println("Total income  =  Rp. " + total + ",-");
        System.out.print("With details  : ");
        System.out.println(" Ani  = Rp. " + totalAni + ",-");
        System.out.println("\t\t Budi = Rp. " + totalBudi + ",-");
        System.out.println("\t\t Bina = Rp. " + totalBina + ",-");
        System.out.println("\t\t Cita = Rp. " + totalCita + ",-");
        System.out.println("==================================");
    }
}
