// Given a non-negative int n, return the sum of its digits recursively (no loops). 
// Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while 
// divide (/) by 10 removes the rightmost digit (126 / 10 is 12).

public class SumDigit {

    public static void main(String[] args) {

        SumDigit reTool = new SumDigit();
        System.out.println(sepDigits(12345));


    }

    static int sepDigits(int input) {

        int sum = 0;

        if ((input / 10) == 0) {
            return 1;
        } else {

            return sum += input % 10 + sepDigits(input / 10);
        }

    }
}

