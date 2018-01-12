import java.util.Scanner;

public class Filtering {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Give me a number");
    int i = Integer.parseInt(sc.next());

    if (i%2==0){
      System.out.println("The number you provided is Even");
    }else{
      System.out.println("The number you provided is Odd");
    }
  }
}
