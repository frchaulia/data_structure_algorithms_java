package week2;
import java.util.Scanner;
public class pacman {

    int x, y, width, height;

    void moveLeft() {
        --x;
    }

    void moveRight() {
        ++x;
    }

    void moveUp() {
        --y;
    }

    void moveDown() {
        ++y;
    }
    void printPosition() {
        System.out.println("current possition: x " + x + " y " + y);
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (i == 0 || i == height - 1) {
                    System.out.print(": ");
                } else if (j == 0 || j == width - 1) {
                    System.out.print(": ");
                } else {
                    if (!(i == y && j == x)) {
                        System.out.print("  ");
                    } else {
                        System.out.print("v ");
                    }

                }
            }         System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        boolean loop;
        pacman pc = new pacman();
        System.out.println("=============");
        do {
            System.out.print("Set width : ");
            int width = userInput.nextInt();
            System.out.print("Set height: ");
            int height = userInput.nextInt();
            if (width < 5 || height < 5) {
                System.out.println("width dan height can't be less than 5");
                loop = true;
            } else {
                loop = false;
                pc.width = width;
                pc.height = height;
                pc.x = 1;
                pc.y = 1;
            }
        } while (loop);

        do {
            System.out.println("===============");
            System.out.print("w to move up\n"
                    + "a to move left\n"
                    + "s to move down\n"
                    + "d to move right\n"
                    + "p to print current possition\n"
                    + "=> ");
            char play = userInput.next().charAt(0);
            switch (play) {
                case 'w':
                    pc.moveUp();
                    break;
                case 'a':
                    pc.moveLeft();
                    break;
                case 's':
                    pc.moveDown();
                    break;
                case 'd':
                    pc.moveRight();
                    break;
                case 'p':
                    pc.printPosition();
                    break;
                default:
                    System.out.println("wrong input");
                    break;
            }
        } while (true);
    }
}
