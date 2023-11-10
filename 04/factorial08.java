package week5;

public class factorial08 {
    int number;

    public int factorialBF(int n){
        int factorial = 1;
        for (int i=1; i<=n; i++){
            factorial=factorial*i;
        }
        return factorial;
    }

    public int factorialDC(int n){
        if(n==1){
            return 1;
        }
        else{
            int factorial = n*factorialDC(n-1);
            return factorial;
        }
    }
}
