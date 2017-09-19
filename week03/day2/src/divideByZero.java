// create a function that takes a number
// divides ten with it,
// and prints the result.
// it should print "fail" if the parameter is 0
import java.util.Scanner;
public class divideByZero{

public static void main(String[]args){

    System.out.println("Give a number");
    Scanner scanner = new Scanner(System.in);
    int divisor = scanner.nextInt();

try{
    int result = 10 / divisor;
    System.out.println(result);
     } catch (ArithmeticException e) {
    System.out.println("Can't divide by zero!");

}

}

        }