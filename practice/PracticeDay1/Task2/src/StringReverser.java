//Olvasson be egy mondatot, majd írja ki (a teljes mondatot) megfordítva.
// (pl: Zöld a fű >> űf a dlöz)
// (A feladatot először a Reverse függvény használata nélkül valósítsuk meg, majd azzal is!!)
//+2: írjuk ki úgy a mondatot, hogy a szavak ugyanolyan sorrendben maradnak, de visszafelé (pl Zöld a fű >> dlöz a űf

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringReverser {

    public static void main(String[] args) {

        System.out.println(reverser("zold a fu"));
        System.out.println(reverser2("zold a fu"));
        System.out.println(reverserOfWords("zold a fu"));

    }

    public static String reverser(String input){
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }
        return reversed;
    }

    public static String reverser2(String input){
        String reversed = new StringBuilder(input).reverse().toString();
        return reversed;
    }

    public static String reverserOfWords(String input){
        List<String> inputWords = Arrays.asList(input.split(" "));
        List<String> outputWords = new ArrayList<>();
        String reversed = "";

        for (int i = 0; i < inputWords.size(); i++) {
            outputWords.add(new StringBuilder(inputWords.get(i)).reverse().toString());
        }

        for (int i = 0; i < outputWords.size(); i++) {
            reversed += outputWords.get(i) + " ";
        }
        return reversed;
    }
}
