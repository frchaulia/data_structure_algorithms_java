package Practicum1;

import java.util.Scanner;

public class Queue08 {
    int[] data;
    int front, rear, size, max;

    public Queue08(int n){
        max = n;
        data = new int[max];
        size = 0;
        front = rear = -1;
    }

    public boolean IsEmpty(){
        if (size == 0){
            return true;
        } else {
            return false;
        }
    }

    public boolean IsFull(){
        if (size == max){
            return true;
        } else {
            return false;
        }
    }

    public void clear(){
        if (!IsEmpty()){
            front = rear = -1;
            size = 0;
            System.out.println("Queue was sucsessfully emptied");
        } else {
            System.out.println("Queue still empty");
        }
    }

    public void Enqueue(int dt){
        if (IsFull()){
            System.out.println("Queue is Full");
        } else {
            if (IsEmpty()){
                front = rear = 0;
            } else {
                if (rear == max - 1){
                    rear = 0;
                } else {
                    rear++;
                }
            }
            data[rear] = dt;
            size++;
        }
    }

    public int Dequeue(){
        int dt = 0;
        if (IsEmpty()){
            System.out.println("Queue is empty");
        } else {
            dt = data[front];
            size--;
            if (IsEmpty()){
                front = rear = -1;
            } else {
                if (front == max - 1){
                    front = 0;
                }else{
                    front++;
                }
            }
        }
        return dt;
    }
    
    public void peek(){
        if (!IsEmpty()){
            System.out.println("Front Element: " + data[front].account + " " + data[front].name + " " + data[front].address + " " + data[front].age + " " + data[front].balance);
        } else {
            System.out.println("Queue is empty");
        }
    }

    public void print(){
        if (IsEmpty()){
            System.out.println("Queue is enply");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(data[front].account + " " + data[front].name + " " + data[front].address + " " + data[front].age + " " + data[front].balance);
                i = (i + 1)%max;
            }
            System.out.println(data[i] + " ");
            System.out.println("number of elemets (size) = " +size);
        }
    }

    public void peekPosition(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter size of array");
        int N = scan.nextInt();
        int[] arr = new int[N + 2];
    System.out.println("All Peak Elements : ");
        for (int i = 1; i <= N; i++)
            if (arr[i - 1] <= arr[i] && arr[i] >= arr[i + 1])
                System.out.println(arr[i] +" at position "+ i);
 
        System.out.println(); 
    }  

    public static void findPeek(){
        if (n == 1)
            return 0;
        if (arr[0] >= arr[1])
                return 0;
        if (arr[n - 1] >= arr[n - 2])
            return n - 1;
    for(int i = 1; i < n - 1; i++){
        if (arr[i] >= arr[i - 1] &&
            arr[i] >= arr[i + 1])
            return i;
    }return 0;
    }
 
    public static void main(String[] args) {
        int arr[] = { 1, 3, 20, 4, 1, 0 };
        int n = arr.length;
        System.out.print("Index of a peak point is " +
            findPeak(arr, n));
    }
}

