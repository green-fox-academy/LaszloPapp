import java.util.Scanner;

public class OneTwo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Give me a number");

        int i = Integer.parseInt(sc.next());

        if(i<=0){
            System.out.println("Not enough");
        }else if(i==1){
            System.out.println("One");
        }else if (i==2) {
            System.out.println("Two");
        }else{
            System.out.println("A lot");
        }

    }
}