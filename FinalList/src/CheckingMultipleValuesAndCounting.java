import java.util.ArrayList;
import java.util.Arrays;

public class CheckingMultipleValuesAndCounting {

    public static void main(String[] args) {

        ArrayList<Integer> arrayListInput = new ArrayList<>(Arrays.asList(1, 11, 34, 11, 52, 61, 1, 34));
        System.out.println(listChecker(arrayListInput));
    }

    public static ArrayList<Integer> listChecker(ArrayList<Integer> input) {

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < input.size(); i++) {
            if(!result.contains(input.get(i))){
                result.add(input.get(i));
            }
        }
        return result;
    }
}
