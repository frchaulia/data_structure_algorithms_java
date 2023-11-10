package week7;

public class exercise3 {
    public static void main(String[] args) {
        int A[] = new int [10];
        A[0] = 11;
        A[1] = 3;
        A[2] = 4;
        A[3] = 2;
        A[4] = 6;
        A[5] = 8;
        A[6] = 7;
        A[7] = 9;
        A[8] = 10;
        A[9] = 5;
        int i,j,N = 10, temp;
        System.out.println("DISPLAY ARRAY OF THE SMALLEST");
        for (i = 0; i < N; i++) {
            for (j = N-1; j>i; j--){
                if (A[j] < A[j-1]){
                temp=A[j];
                A[j]=A[j-1];
                A[j-1]=temp;
                }
            }
        }
        for (j = 0; j < N; j++) {
            System.out.print(A[j]);
        }
        int max;
        max = A[0];
        for(i = 0; i < N; i++) {
            if (A[i] > max){
              max = A[i];
              temp = i+1;
            }
          }
      }
}
