import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class sortThatList {

    public static void main(String[] args) {

        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(34, 12, 24, 9, 5));

        System.out.println(listSorter(input));
    }

    static ArrayList<Integer> listSorter(ArrayList<Integer> tosort){

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < tosort.size(); i++) {
            if(result.add(tosort.get(i))) {
                Collections.sort(result);
            }
        }
        return result;
    }

}
