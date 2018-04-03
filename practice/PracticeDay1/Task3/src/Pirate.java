//Saját kalóznyelv létrehozása 2
//A nyelv nagyon hasonlít az angolra, csak minden szó első betűje a szó legvégére kerül és hozzádjuk,
//hogy arr (pl rum >> umrarr).
//Készítsünk fordítóprogramot, hogy a felhasználó által beírt szöveget, mondatot lefordítja és kiírjuk kalózul.
//(egy teljes mondatot átkonvertálunk (String > String[])

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pirate {

    public static void main(String[] args) {

        System.out.println(pirating("Damn ground rats"));
    }

    private static String pirating(String input) {
        List<String> inputWords = Arrays.asList(input.split(" "));
        List<String> outputWords = new ArrayList<>();
        List<String> words = new ArrayList<>();
        String pirated = "";
        String firstLetter = "";

        for (int i = 0; i < inputWords.size(); i++) {
            words.add(inputWords.get(i).substring(1));
            firstLetter = String.valueOf(inputWords.get(i).charAt(0));
        }
        for (int j = 0; j < words.size(); j++) {
            StringBuffer sb = new StringBuffer(words.get(j));
            outputWords.add(String.valueOf(sb.append(firstLetter)));
        }


        return pirated;
    }
}
