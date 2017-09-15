public class PalindromeBuilder {

    public static void main(String[] args) {

        String inPalin = "kuttya";

        System.out.println(paliBuilder(inPalin));

    }

    static String paliBuilder(String inPalin) {



        for (int i = inPalin.length()-1; i >= 0; i--) {
            System.out.print(inPalin.charAt(i));
        }
        return inPalin;
    }
}


