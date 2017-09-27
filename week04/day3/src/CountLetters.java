import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountLetters {
    String input;
    public CountLetters(String input){
        this.input = input;
    }

    public HashMap<Character, Integer> letterNum(){
            char[] c = input.toCharArray();
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < input.length(); i++) {
                if (!map.containsKey(c[i])) {
                    map.put(c[i], 1);
                } else {
                    map.put(c[i], map.get(c[i]) + 1);
                }
            }
            return map;
    }

}
