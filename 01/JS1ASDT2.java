import java.util.Scanner;
public class JS1ASDT2 {
    static double velocityFormula(double s, double t) {
        double vF = s / t;
        return vF;
    }

    static double distanceFormula(double v, double t) {
        double dF = v * t;
        return dF;
    }

    static double timeFormula(double s, double v) {
        double tF = s / v;
        return tF;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double s, v, t;
        s = 0;
        v = 0;
        t = 0;

        System.out.println("==================================");
        System.out.println("Menu :");
        System.out.println("==================================");
        System.out.println("1. Calculate Speed ");
        System.out.println("2. Calculate Distance");
        System.out.println("3. Calculate Time");
        System.out.println("==================================");
        System.out.print("Your menu of choice is  : ");
        int answer = sc.nextInt();

        switch (answer) {
            case 1:
                System.out.print("Enter Distance (km)   = ");
                s = sc.nextInt();
                System.out.print("Enter Time (hour)     = ");
                t = sc.nextInt();
                double resultOne = velocityFormula(s, t);
                System.out.println("Speed of = " + resultOne + "\n");
                break;
            case 2:
                System.out.print("Enter Velocity (km/h) = ");
                v = sc.nextInt();
                System.out.print("Enter Time (hour)     = ");
                t = sc.nextInt();
                double resultTwo = distanceFormula(v, t);
                System.out.println("Distance cover = " + resultTwo + "\n");
                break;
            case 3:
                System.out.print("Enter Distance (km)   = ");
                s = sc.nextInt();
                System.out.print("Enter Velocity (km/h) = ");
                v = sc.nextInt();
                double resultThree = timeFormula(s, v);
                System.out.println("Time required = " + resultThree + "\n");
                break;
        }
        System.out.println("==================================");
    }
}
