import java.util.Scanner;
import java.util.Random;


public class GuessMyNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Set the range of numbers!");

        int inputSet = sc.nextInt();

        int  n = rand.nextInt(inputSet) + 1;


        System.out.println("Guess a number between 1 and " + inputSet);

        int inputGuess = sc.nextInt();

        System.out.println(numCheck(inputGuess, n));


    }

    static int numCheck(int inputGuess, int n) {

        Scanner sc = new Scanner(System.in);

        while(inputGuess!=n) {

            if (inputGuess == n) {
                System.out.println("Congratulations. You won!");
            } else if (inputGuess > n) {
                System.out.println("Too high " + (" Try again!"));
                 inputGuess = sc.nextInt();
            } else if (inputGuess < n) {
                System.out.println("Too low " + " Try again!");
                 inputGuess = sc.nextInt();
            } else {

            }
        }
            return inputGuess;
    }
}




