package Practicum2;
import java.util.Scanner;

public class PostfixMain08 {
    Scanner sc08 = new Scanner(System.in);
    String P, Q;
    System.out.println("Input Infix Notation: ");
    Q = sc08.nextLine();
    Q = Q.trim();
    Q = Q + ")";

    int total = Q.length();

    Postfix08 post = new Postfix08(total);
    P = post.Conversion(Q);
    System.out.println("Postfic: " + P);
}
