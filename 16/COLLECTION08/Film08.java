package COLLECTION08;

public class Film08 {
    String id, judul, tahun, director;

    public Film08(String id, String judul, String tahun, String director) {
        this.id = id;
        this.judul = judul;
        this.tahun = tahun;
        this.director = director;
    }

    public String toString() {
        return "Film{" + "id=" + id + ", judul=" + judul + ", tahun=" +
        tahun + ", director=" + director + '}';
    }
}
