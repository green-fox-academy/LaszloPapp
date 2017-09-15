import java.util.Scanner;

public class DrawSquare {

    public static void main(String[] args) {

          Scanner sc = new Scanner(System.in);

        System.out.println("Give a number");

          int uInput = sc.nextInt();


        for (int i = 0; i < uInput; i++) {
            for (int j = 0; j < uInput; j++) {
                if ((i>0)&&(j>0)&&((i<(uInput-1))&&(j<(uInput-1)))) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");

                }

            }
            System.out.println();
        }
    }
}








