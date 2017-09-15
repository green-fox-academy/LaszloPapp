import java.util.Scanner;

public class DrawDiamond {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Give a number");

        int userInput = sc.nextInt();


        for (int i = 0; i < userInput; i++) {
            for (int j = 0; j < userInput - i; ++j) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 0; i < userInput ; i++) {
            for (int j = 0; j <= i; ++j) {
                System.out.print(" ");
            }
            for (int j = 0; j < userInput-i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }

    }

}