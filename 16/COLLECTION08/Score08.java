package COLLECTION08;

public class Score08 {
    String nim, nama, namaMk, sks;
    Double nilai;
    public Score08(String nim, String nama, String namaMk, String sks, Double nilai) {
        this.nim = nim;
        this.nama = nama;
        this.namaMk = namaMk;
        this.sks = sks;
        this.nilai = nilai;
    }
    public String toString() {
        return String.format("%s\t%-15s\t%-40s%s\t%.2f", nim, nama, namaMk,
    sks, nilai);
    }
}
