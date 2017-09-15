import java.util.Scanner;

public class drawTriangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Give a number");
        int userInput = sc.nextInt();

            for (int i=1; i <= userInput; i++) {
            for (int j=1; j <= i; ++j) {
                System.out.print("*");
            }
                System.out.println();
        }
    }
}
