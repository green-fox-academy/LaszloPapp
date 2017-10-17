import java.util.ArrayList;
import java.util.Arrays;

public class Printer {

    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList(Arrays.asList());
        // - Create a function called `printer`
        //   which prints the input String parameters
        // - It can have any number of parameters
        System.out.println();
    }

    public static void printer(String... strings) {
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }


    }
}
