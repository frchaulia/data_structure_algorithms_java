public class JS1ASD4 {
    public static void main(String []args){
        //Task 2.5.1 Lab Unit 4 : Functions
        System.out.println ("\t");
        System.out.println ("*********************************");
        System.out.println ("Task 2.5.1 Lab Unit 4 : Functions");		
        System.out.println ("*********************************");
        System.out.println ("\t");
        System.out.println("ROYAL GARDEN DATA");
        System.out.println("=================================");
        //Declaration
        int supply[][]={{ 10 , 5 , 15 ,7 },{ 6 , 11 , 9 , 12 },{ 2 , 10 , 10 , 5 },{ 5 , 7 , 12 , 9 }};
        displaySupply(supply);
        totalSupply(supply);
    }
    public static void displaySupply(int[][] f){
    int x,y;
        for(x=0; x<f.length; x++){
            for(y=0; y<f[0].length; y++){
                System.out.print(f[x][y]+" ");
            }System.out.println();
        }
    }
    public static void totalSupply(int[][] f){
        int x,y;
        int supplyI=0;
        int supplyII=0;
        int supplyIII=0;
        int supplyIV=0;
        for (x=0; x<f.length; x++) {
            for (y=0; y<f[0].length; y++) {
                if (y==0) {
                    supplyI += f[x][0];
                }
                else if (y==1) {
                    supplyII += f[x][1];
                }
                else if (y==2) {
                    supplyIII += f[x][2];
                }
                else{
                    supplyIV += f[x][3];
                }
            }
        }
        System.out.println("=================================");
        System.out.println("Total supply based on the type of flowers in all branches");
        System.out.println("=================================");
        System.out.println("Aglonema = "+supplyI); 
        System.out.println("Caladium = "+supplyII); 
        System.out.println("Alocasia = "+supplyIII); 
        System.out.println("Rose     = "+supplyIV);
        System.out.println("=================================");
    }
    
}
