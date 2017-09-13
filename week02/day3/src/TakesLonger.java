public class TakesLonger {

    public static void main(String... args){

        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        StringBuffer bs = new StringBuffer("Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.");
        bs.insert(20, " always takes longer than");
        System.out.println(bs);

    }

}
