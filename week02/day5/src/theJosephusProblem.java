import java.util.ArrayList;
import java.util.Scanner;

public class theJosephusProblem {

    public static void main(String[] args) {

        System.out.println(winning(7));

    }

    static ArrayList<Integer> winning(int play){
        ArrayList<Integer> survive= new ArrayList<>();

        for (int i = 1; i < play + 1; i++) {
            survive.add(i);
        }

        while(survive.size() != 1){
            for(int i = 0; i < survive.size(); i++){
                if(survive.get(i) % 2 == 0) survive.remove(i);
                if(survive.get(i) == survive.size() && i % 2 != 0) survive.remove(0);
            }
        }
       return survive;
        }

    }


