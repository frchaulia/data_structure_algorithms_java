import java.util.Scanner;
    public class JS1ASD2{
        public static void main(String []args){
            //Task 2.3.1 Lab Unit 2 : Looping
            System.out.println ("\t");
            System.out.println ("*********************************");
            System.out.println ("Task 2.3.1 Lab Unit 2 : Looping");		
            System.out.println ("*********************************");
            System.out.println ("\t");
            //Declaration Variable
            Scanner sc = new Scanner(System.in);
            int n, nim, a;
            int b = 0;
            System.out.print("Enter your NIM = ");
            nim = sc.nextInt();
            n = nim%100;
            System.out.println("=============================");
            //Looping 
            if (n < 10) {
                n += 10;
                System.out.println("The last 2 digits (n) = " + n);
                System.out.println("=============================");
                for (a=1; a<=n; a++) {
                    if (b%7 == 0) {
                        System.out.print("Monday  ");
                    }
                    else if (b%7 == 1) {
                        System.out.print("Tuesday  ");
                    }
                    else if (b%7 == 2) {
                        System.out.print("Wednesday  ");
                    }
                    else if (b%7 == 3) {
                        System.out.print("Thursday  ");
                    }
                    else if (b%7 == 4) {
                        System.out.print("Friday  ");
                    }
                    else if (b%7 == 5) {
                        System.out.print("Saturday  ");
                    }
                    else{
                        System.out.print("Sunday  ");
                    }
                    b++;
                }
            } 
            else {
                for (a=1; a<=n; a++) {
                    if (b%7 == 0) {
                        System.out.print("Monday  ");
                    }
                    else if (b%7 == 1) {
                        System.out.print("Tuesday  ");
                    }else if (b%7 == 2) {
                        System.out.print("Wednesday  ");
                    }else if (b%7 == 3) {
                        System.out.print("Thursday  ");
                    }else if (b%7 == 4) {
                        System.out.print("Friday  ");
                    }else if (b%7 == 5) {
                        System.out.print("Saturday  ");
                    }else{
                        System.out.print("Sunday  ");
                    }
                    b++;
                }
            }
            System.out.println ("\t");
        }
    }
