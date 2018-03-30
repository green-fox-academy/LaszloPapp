import java.util.ArrayList;
import java.util.List;

public class TestCase {

    int person;
    MyPosition average;
    double worstDistance;
    List<Direction> instructions;

    public TestCase(int person) {
        this.person = person;
        this.instructions = new ArrayList<Direction>();
    }

    public int getPerson() {
        return person;
    }

    public MyPosition getAverage() {
        return average;
    }

    public double getWorstDistance() {
        return worstDistance;
    }

    public List<Direction> getInstructions() {
        return instructions;
    }

    public void setInstructions(List<Direction> instructions) {
        this.instructions = instructions;
    }
}
