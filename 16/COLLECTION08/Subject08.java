package COLLECTION08;

public class Subject08 {
    String kodeMk, namaMk, sks;
    public Subject08(String kodeMk, String namaMk, String sks) {
        this.kodeMk = kodeMk;
        this.namaMk = namaMk;
        this.sks = sks;
    }
    public String toString() {
        return String.format("%s\t%-40s%s", kodeMk, namaMk, sks);
    }
}
