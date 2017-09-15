import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Adja meg az elso szot");

        String input1 = sc.nextLine();


        System.out.println("Adja meg a masodik szot");

        String input2 = sc.nextLine();

        System.out.println(anagramCheck(input1, input2));

    }

    static boolean anagramCheck(String input1, String input2) {

        boolean anagram = true;

        for (int i = 0; i <= input1.length(); i++) {
            for (int j = 0; j <= input2.length(); j++) {
                if (input1!= input2) {
                    anagram = false;
                } else {
                    anagram = true;
                }

            }

        }
        return anagram;
    }
}


