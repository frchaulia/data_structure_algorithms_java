package COLLECTION08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainAss08 {
    public static void main(String[] args) {
        // instantiation
        Scanner scan = new Scanner(System.in);
        ArrayList<StudentAss08> mahasiswas = new ArrayList<>();
        ArrayList<Subject08> mataKuliahs = new ArrayList<>();
        ArrayList<Score08> nilais = new ArrayList<>();
        // initialization for mahasiswa and mataKuliah
        mahasiswas.add(new StudentAss08("20001", "Thalhah", "021xxx"));
        mahasiswas.add(new StudentAss08("20002", "Zubair", "021xxx"));
        mahasiswas.add(new StudentAss08("20003", "Abdur-Rahman", "021xxx"));
        mahasiswas.add(new StudentAss08("20004", "Sa'ad", "021xxx"));
        mahasiswas.add(new StudentAss08("20005", "Sa'id", "021xxx"));
        mahasiswas.add(new StudentAss08("20006", "Ubaidah", "021xxx"));
        mataKuliahs.add(new Subject08("00001", "Internet of Things", "3"));
        mataKuliahs.add(new Subject08("00002", "Algoritma dan Struktur Data", "2"));
        mataKuliahs.add(new Subject08("00003", "Algortima dan Pemrograman", "2"));
        mataKuliahs.add(new Subject08("00004", "Praktikum Algoritma dan Struktur Data", "3"));
        mataKuliahs.add(new Subject08("00005", "Praktikum Algoritma dan Pemrograman", "3"));
        // main menu
        menu: while (true) {
        printMenu();
        System.out.print("Pilih: ");
        int pilih = scan.nextInt();
        scan.nextLine();
            switch (pilih) {
            case 1:
                inputNilai(mahasiswas, mataKuliahs, nilais, scan);
            break;
            case 2:
                printNilai(nilais);
            break;
            case 3:
                findNilai(nilais, scan);
            break;
            case 4:
                nilais.sort((n1, n2) -> n1.nilai.compareTo(n2.nilai));
                printNilai(nilais);
            break;
            case 5:
            break menu;
            }
        }
        scan.close();
    }

        static void printMenu() {
            System.out.println("***********************************************");
            System.out.println("SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER");
            System.out.println("***********************************************");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("5. Keluar");
            System.out.println("***********************************************");
        }
        // method for input nilai
        static void inputNilai(ArrayList<StudentAss08> mahasiswas, ArrayList<Subject08> mataKuliahs,
        ArrayList<Score08> nilais, Scanner scan) {
            System.out.println("~Masukan data~");
            System.out.print("Nilai\t: ");
            double nilai = scan.nextDouble();
        scan.nextLine();
        // find mahasiswa
            System.out.println("\nDAFTAR MAHASISWA");
            System.out.println("***********************************************");
            System.out.printf("%s\t%-15s\t%s\n", "NIM", "Nama", "Telf");
            mahasiswas.forEach(mahasiswa -> System.out.println(mahasiswa));
            System.out.print("Pilih mahasiswa by nim: ");
        String nim = scan.nextLine();
    }
}