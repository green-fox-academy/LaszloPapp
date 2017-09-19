import java.util.ArrayList;

public class palindromeSearcher {

    public static void main(String[] args) {

        String input = "dog goat dad duck doodle never";



        ArrayList<String> output = Palin(input);
        ArrayList<String> output1 = evenPalin(input);
        System.out.println(output);
        System.out.println(output1);
    }


    static ArrayList<String> Palin(String input) {
        ArrayList<String> output = new ArrayList<>();
        ArrayList<String> temp = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            if (i > 2 && input.charAt(i) == input.charAt(i - 2)) {
                temp.add(input.substring(i - 2, i + 1));
                output.add(temp.toString());
                temp.clear();
                int x = 3;
                int y = 1;
                while (i >= x && input.charAt(i - x) == input.charAt(i + y)) {
                    temp.add(input.substring(i - x, i + y + 1));
                    output.add(temp.toString());
                    temp.clear();
                    x++;
                    y++;
                }
            }
        }
        return output;
    }

    static ArrayList<String> evenPalin(String input) {

        ArrayList<String> output1 = new ArrayList<>();
        ArrayList<String> temp = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            if (input.length() % 2 == 0) {
                if (i > 3 && input.charAt(i) == input.charAt(i-3)) {
                    temp.add(input.substring(i - 3, i + 1));
                    output1.add(temp.toString());
                    temp.clear();
                    int x = 2;
                    int y = 1;
                    while (i >= x && input.charAt(i - x) == input.charAt(i+y)) {
                        temp.add((input.substring(i - x, i + y)));
                        output1.add(temp.toString());
                        temp.clear();
                        x++;
                        y++;
                    }
                }
            }

        }
        return output1;

    }
}



