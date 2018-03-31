import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCase {

    int person;
    MyPosition average;
    double worstDistance;
    List<Direction> instructions;

    public TestCase(int person) {
        this.person = person;
        this.instructions = new ArrayList<>();
    }

    public TestCase() {

    }

    /**
     * Method to calculate the "MyPosition" average position.
     */
    public void calculateAveragePosition(){

        double averagePositionX = 0;
        double averagePositionY = 0;
        double sumListElementX = 0;
        double sumListElementY = 0;

        for (int i = 0; i < instructions.size(); i++) {
            sumListElementX += instructions.get(i).getDirectedPosition().getPositionX();
            sumListElementY += instructions.get(i).getDirectedPosition().getPositionY();
        }
        averagePositionX = sumListElementX / person;
        averagePositionY = sumListElementY / person;

        average = new MyPosition(averagePositionX, averagePositionY);
    }

    /**
     * Method to calculate the distance from the average position.
     * @param position
     * @return
     */
    private double calculateDistanceFromAverage(MyPosition position){
        double distance = Math.sqrt(Math.pow((position.getPositionX() - average.getPositionX()),2) +
                Math.pow((position.getPositionY() - average.getPositionY()),2));
        return distance;
    }

    /**
     * Method to calculate the worst from the given distances.
     */
    public void calculateWorstDistance(){
        List<Double> distances = new ArrayList<>();

        for (int i = 0; i < instructions.size(); i++) {
            distances.add(calculateDistanceFromAverage(instructions.get(i).getDirectedPosition()));
        }
        worstDistance = Collections.max(distances);
    }
}
