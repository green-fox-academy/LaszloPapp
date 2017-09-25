import java.util.ArrayList;
import java.util.List;

public class Dominoes {

    public static void main(String[] args) {

        List<Domino> dominoes = initializeDominoes();

        // You have the list of Dominoes

        // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides

        // eg: [2, 4], [4, 3], [3, 5] ...

        System.out.println(dominoes);

    }

    static List<Domino> initializeDominoes() {

        List<Domino> dominoes = new ArrayList<>();

        dominoes.add(new Domino(5, 2));

        dominoes.add(new Domino(4, 6));

        dominoes.add(new Domino(1, 5));

        dominoes.add(new Domino(6, 7));

        dominoes.add(new Domino(2, 4));

        dominoes.add(new Domino(7, 1));

        List<Domino> temp = new ArrayList<>();

     /*   for (int i = 0; i < dominoes.size(); i++) {
            for (int j = 0; j < dominoes.size(); j++) {
                    if(dominoes.get(i).getValues()[1]==dominoes.get(j).getValues()[0]){
                        temp.add(dominoes.get(i));
                        temp.add(dominoes.get(j));




                        }
                    }
                }*/
int tempIndex = -1;

        while(dominoes.size()>0){
            if(temp.size()==0){
                temp.add(dominoes.get(0));
                tempIndex++;
                dominoes.remove(0);
            }else {

                for(Domino item : dominoes){
                    if(temp.get(tempIndex).getValues()[1]==item.getValues()[0]){
                        temp.add(item);
                        tempIndex++;
                        dominoes.remove(item);
                        break;
                    }
                }
            }
        }

        return temp;

    }

}
