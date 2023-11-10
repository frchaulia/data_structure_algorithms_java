package week6;

public class studentAchievList08 {
    Student08 StudentList [] = new Student08 [5];
    int index;

    public void add(Student08 s){
        if (index<StudentList.length){
            StudentList[index]=s;
            index++;
        }
        else{
            System.out.println("Data is Full");
        }
    }
    public void display(){
        for (Student08 s : StudentList){
            s.dispStudent();
            System.out.println("==========================");
        }
    }
    public void bubbleSort(){
        for (int i=0; i<StudentList.length-1; i++){
            for(int j=0; j<StudentList.length-i-1;j++){
                if(StudentList[j].GPA<StudentList[j+1].GPA){
                    //Swapping Process
                    Student08 tmp = StudentList[j];
                    StudentList[j] = StudentList[j+1];
                    StudentList[j+1]=tmp;
                }
            }
        }
    }
    public void selectionSort(){
        for (int i=0; i<StudentList.length-1;i++){
            int indexMin=i;
            for(int j=i+1; j<StudentList.length; j++){
                if(StudentList[j].GPA<StudentList[indexMin].GPA){
                    indexMin=j;
                }
            }
            //Swapping process
            Student08 tmp = StudentList[indexMin];
            StudentList[indexMin] = StudentList[i];
            StudentList[i]=tmp;
        }
    }
    public void insertionSort(){
        for(int i=1; i<StudentList.length;i++){
            Student08 temp=StudentList[i];
            int j=i;
            while(j>0 && StudentList[j-1].GPA>temp.GPA){
                StudentList[j]=StudentList[j-1];
                j--;
            }
            StudentList[j]=temp;
        }
    }
}