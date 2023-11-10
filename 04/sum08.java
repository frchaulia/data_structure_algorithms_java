package week5;

public class sum08 {
    public int element;
    public double profit[];

    public sum08(int elements){
        this.element=elements;
        this.profit=new double[elements];
    }

    double totalBF(double arr[]){
        double totalProfit=0;
        for(int i=0; i<arr.length; i++){
            totalProfit=totalProfit+arr[i];
        }
        return totalProfit;
    }

    double totalDC(double arr[], int l, int r){
        if(l==r){
            return arr[l];
        }
        else if(l<r){
            int mid = (l+r){
                double lsum = totalDC(arr, l, mid-1);
                double rsum = totalDC(arr, mid=1, r);
                return lsum+rsum+arr[mid];
            }
            return 0;
        }
    }
}
