import java.util.Scanner;

public class GuessTheNumber {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Give a number");

        int guessInput = sc.nextInt();


        int target = 8;

        for (int i = 0; i < 1; i++) {
            if (guessInput == target) {
                System.out.println("You found the number: 8");
            } else if (target > guessInput) {
                System.out.println("The stored number is higher");
            } else if (target < guessInput) {
                System.out.println("The stored number is lower");
            } else {
            }

        }
    }
}
