
public class Reverse {

    public static void main(String... args){

        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        System.out.println(reverse(reversed));

    }

        public static String reverse(String text) {
            if ((null == text) || (text.length() <= 1))
                {
                return text;
                }
                return reverse(text.substring(1)) + text.charAt(0);
        }

}
