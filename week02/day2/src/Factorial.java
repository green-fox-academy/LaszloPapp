public class Factorial {

    public static void main(String[] args) {

        System.out.println(factorio(5));

    }

    public static int factorio(int till) {
        int facAllNum = 1;
        for (int i = 1; i < till; i++) {
            facAllNum *= i;
        }
        return facAllNum;
    }
}
