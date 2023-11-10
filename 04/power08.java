package week5;

public class power08 {
    int base, exponent;

    public int powerBF(int b, int e){
        int result=1;
        for(int i=0; i<e; i++){
            result=result*b;
        }
        return result;
    }

    public int powerDC(int b, int e){
        if(e==0){
            return 1;
        }
        else{
            if(e%2==1){
                return (powerDC(b, e/2)*powerDC(b, e/2)*b);
            }
            else{
                return (powerDC(b, e/2)*powerDC(b, e/2));
            }
        }
    }
}
