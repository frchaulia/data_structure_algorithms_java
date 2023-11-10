package Exercise2;

import java.util.Scanner;

public class QueueStd {
    int num[MAX];
    int head=-1, tail=-1, k=1;

    boolean IsEmpty(){
        if(tail == -1){
            return true;
        } else {
            return false;
        }
    }

    boolean IsFull(){
        if(tail == MAX-1){
            return true;
        } else {
            return false;
        }
    }

    void Enter(int ya){
        if(IsEmpty()){
            head=tail=0;
        } else {
            tail++;
        }
        num[tail]=ya;
    }

    void Out(){
        if(IsEmpty()){
            System.out.println("Queue is empty");
        } else {
            for(int j=head;j<tail;j++){
                num[j]=num[j+1];
            }
            tail--;
            if(tail==-1){
                head=-1;
            }
        }
    }

    void Clear(){
        head=tail=-1;
        k=1;
    }

    void View(){
        if(IsEmpty()){
            System.out.println("Queue is empty");
        } else {
            int j;
            System.out.println("Queue registered");
                for(int k=1;k<=j;k++){
                    System.out.println("Queue num:" +k);
                    System.out.println("Queue delayed");
                } for(j=head;j<=tail;j++){
                System.out.println("Queue num:" +num[j]);
                }
            }
        }
    }

    int main(){
        int choice,order;
        int cls;
        do{
            menu();
            cls = sc.nextInt();
            switch (cls){
                case 1:
                    System.out.println("Input New Data: ");
                    int InputData = sc.nextInt();
                    Q.Enqueue(InputData);
                    break;
                case 2:
                    int DeletedData = Q.Dequeue();
                    if (DeletedData != 0) {
                        System.out.println("Deleted data: " +DeletedData);
                        break; 
                    }
                case 3:
                    Q.Out();
                    break;
                case 4:
                    Q.enter();
                    break;
                case 5:
                    Q.clear();
                    break;
            }
        } 
        while (cls == 1 || cls == 2 || cls == 3 || cls == 4 || cls == 5);
        }
    }
}
