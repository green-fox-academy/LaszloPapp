
import java.util.Scanner;

public class AnimalsAndLegs {

    public static void main(String[] args) {

        // Write a program that asks for two integers

        // The first represents the number of chickens the farmer has

        // The seconf represents the number of pigs the farmer has

        // It should print how many legs all the animals have

        Scanner sc = new Scanner(System.in);

            System.out.println("How many chicken?");

        int userInput1 = sc.nextInt();

            System.out.println("How many pigs?");

        int userInput2 = sc.nextInt();

            System.out.println("There are " + ((userInput1*2)+(userInput2*4)) + " legs all together");
    }
}
