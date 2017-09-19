import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class paliSearcher {

    public static void main(String[] args) {

        String input = "racecar";

        ArrayList<String> output = Palin(input);
        System.out.println(output);

    }

/*    static ArrayList<String> Palin(String input){

        for(int i = 0; i < input.length(); i++){
            StringBuilder temp = new StringBuilder();
            if(input.charAt(i) == input.charAt((input.length() - 1)  - i)){
                temp.append(input.charAt(i));
            }
        }
        return new ArrayList<>();*/


    static ArrayList<String> Palin(String input){
        ArrayList<String> output = new ArrayList<>();
        ArrayList<String> temp = new ArrayList<>();

        for (int i = 0; i < input.length(); i++) {
            for (int j = input.length()-1; j > 0 ; j--) {
                if ((j>i)&&input.charAt(i) == input.charAt(j)){
                    temp.add(input.substring(i, j));
                    output.add(temp.toString());
                    temp.clear();
                }
            }

        }
        return output;
    }

}
