import java.lang.reflect.Array;
import java.util.List;

public class Reverse {

    public static void main(String... args){

        String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

        System.out.println(reverse(reversed));

        System.out.println(reverser(".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI"));

    }

        public static String reverse(String text) {
            if ((null == text) || (text.length() <= 1))
                {
                return text;
                }
                return reverse(text.substring(1)) + text.charAt(0);
}

        static String reverser(String reBack){

                for (int j = reBack.length()-1; j > 0; j--) {
                    reBack.charAt(j);
                }
                return reBack;
        }

}
