import java.util.Scanner;


public class HelloUser {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Modify this program to greet user instead of the World!

        // The program should ask for the name of the user

        System.out.println("What's your name?");

        String userInput = sc.nextLine();


        System.out.println("Hello " + userInput + "!");

    }

}
