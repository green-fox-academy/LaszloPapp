public class Summing {

    public static void main(String[] args) {

        System.out.println(sum(21));

    }

    public static int sum(int till) {
        int sumAllNumbers = 0;
        for (int i = 0; i < till; i++) {
            sumAllNumbers += i;
        }
        return sumAllNumbers;
    }

}
