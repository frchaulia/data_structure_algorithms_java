package week7;

public class StudentSearch08 {
    Student08 StudentList[]=new Student[5];
    int index;

    void addStudent(Student08 s){
        if(index<StudentList.length){
            StudentList[index]=s;
            index++;
        }else{
            System.out.println("Data is Full");
        }
    }

    void display(){
        for(Student08 s : StudentList){
            s.dispStudent();
            System.out.println("======================");
        }
    }

    public int FindSeqSearch(int key){
        int pos = -1;
        for(int j=0; j<StudentList.length; j++){
            if(StudentList[j].nim==key){
                pos=j;
                break;
            }
        }
        return pos;
    }

    void DispPosition(int x, int pos){
        if(pos!=-1){
            System.out.println(x+"data found at index : " +pos);
        }else{
            System.out.println(x+"data not found");
        }
    }

    void DispData(int x, int pos){
        if(pos!=-1){
            System.out.println("Nim  : "+x);
            System.out.println("Nama : "+StudentList[pos].name);
            System.out.println("Age  : "+StudentList[pos].age);
            System.out.println("GPA  : "+StudentList[pos].GPA);
        }else{
            System.out.println(x+"data not found");
        }
    }

    data.DispPosition(key, position);
    data.DispData(key, position);
}
