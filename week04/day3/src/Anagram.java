import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {

    private String in1;
    private String in2;

    public boolean anagramCheck(String a, String b){



        if(a.length()!=b.length())
            return false;

        char[] oneArray = a.toCharArray();
        char[] twoArray = b.toCharArray();

        Arrays.sort(oneArray);
        Arrays.sort(twoArray);

        return Arrays.equals(oneArray,twoArray);

    }

    public String getIn1() {
        return in1;
    }

    public void setIn1(String in1) {
        this.in1 = in1;
    }

    public String getIn2() {
        return in2;
    }

    public void setIn2(String in2) {
        this.in2 = in2;
    }
}
