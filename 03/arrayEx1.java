package week3exercise;
import java.util.Scanner;

public class arrayEx1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How Many beam : ");
        int a = sc.nextInt();
        beamEx1[] beam=new beamEx1[a];
        System.out.println("How Many pyramid :" );
        int b = sc.nextInt();
        pyramidEx1[] pyramid= new pyramidEx1[b];
        System.out.println("How Many cone :" );
        int c = sc.nextInt();
        coneEx1[] cone= new coneEx1[c];
        System.out.println("=======================");

        for(int i=0; i<beam.length; i++){
            beam[i]= new beamEx1();

            System.out.println(i+"th beam:");
            System.out.println("sc length : ");
            beam[i].length = sc.nextInt();
            System.out.println("sc width : ");
            beam[i].width = sc.nextInt();
            System.out.println("sc heigth : ");
            beam[i].height = sc.nextInt();
            System.out.println("==========result==========");
            System.out.println("volume of "+i+"th beam: "+ beam[i].calcVolume());
            System.out.println("surface of "+i+"th beam: "+ beam[i].calcSurface());
            System.out.println("==========================");

        }

        for(int i=0; i<pyramid.length; i++){
            pyramid[i]= new pyramidEx1();

            System.out.println(i+"th pyramid : ");
            System.out.println("sc base length : ");
            pyramid[i].bsLength = sc.nextInt();
            System.out.println("sc heigth : ");
            pyramid[i].height = sc.nextInt();
            System.out.println("sc triangle base : ");
            pyramid[i].trglBase = sc.nextInt();
            System.out.println("sc triangle height : ");
            pyramid[i].trglHeight = sc.nextInt();
            System.out.println("==========result==========");
            System.out.println("volume of "+i+"th pyramid: "+ pyramid[i].calcVolume());
            System.out.println("surface of "+i+"th pyramid: "+ pyramid[i].calcSurface());
            System.out.println("==========================");
        }

        for(int i=0; i<cone.length; i++){
            cone[i]= new coneEx1();
            System.out.println("sc radius : ");
            cone[i].rad =sc.nextInt();
            System.out.println("sc heigth : ");
            cone[i].height=sc.nextInt();
            System.out.println("sc painter line : ");
            cone[i].painterLine=sc.nextInt();
            System.out.println("==========result==========");
            System.out.println("volume of "+i+"th cone: "+ cone[i].calcVolume());
            System.out.println("surface of "+i+"th cone: "+ cone[i].calcSurface());
            System.out.println("==========================");
        }
        
    }
}
