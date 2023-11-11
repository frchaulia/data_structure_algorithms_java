package COLLECTION08;

import java.util.List;

public class Student08 {
    public String nim;
    public String name;
    public String noHandphone;

    public Student08(String nim, String name, String noHandphone){
        this.nim = nim;
        this.name = name;
        this.noHandphone = noHandphone;
    }

    public String toString(){
        return "Mahasiswa{" + "nim = " +nim+ ", no Handphone = " + noHandphone + ')';
    }

    List<Student08> mahasiswas = new ArrayList<>();

    public void adds(Student08 mahasiswa){
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void delete(int index){
        mahasiswas.remove(index);
    }
    
    public void update(int index, Student08 mhs){
        mahasiswas.set(index, mhs);
    }

    public void display(){
        mahasiswas.stream().forEach(mhs {
            System.out.println("" + mhs.toString());
        });
    }

    int linearSearch(String nim){
        for(int i = 0; i<mahasiswas.size(); i++){
            if(nim.equals(mahasiswas.get(i).nim)){
                return i;
            }
        }
        return -1;
    }
}
