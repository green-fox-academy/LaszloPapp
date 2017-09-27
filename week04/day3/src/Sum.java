import java.util.ArrayList;

public class Sum {

    private ArrayList<Integer> sumList;

    public int sum(ArrayList<Integer> sumList) {
        int sumNum = 0;
        for (int i = 0; i < sumList.size(); i++) {
            sumNum+=sumList.get(i);

        }
        return sumNum;
    }

    public ArrayList<Integer> getSumList() {
        return sumList;
    }

    public void setSumList(ArrayList<Integer> sumList) {
        this.sumList = sumList;
    }

}
