import java.util.Scanner;

public class countFromTo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Type the first number!");

        int firstNum = sc.nextInt();

        System.out.println("Type the second number!");

        int secondNum = sc.nextInt();

        if (secondNum<firstNum) {
            System.out.println("The second number should be bigger");
        }else{
            for (int i=firstNum; i < secondNum+1; i++){
                System.out.println(i);
            }

        }
    }

}
