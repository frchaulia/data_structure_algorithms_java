package COLLECTION08;

public class StudentAss08 {
    String nim, nama, noTelp;
    public StudentAss08(String nim, String nama, String noTelp) {
        this.nim = nim;
        this.nama = nama;
        this.noTelp = noTelp;
    }
    public String toString() {
        return String.format("%s\t%-15s\t%s", nim, nama, noTelp);
    }
}
