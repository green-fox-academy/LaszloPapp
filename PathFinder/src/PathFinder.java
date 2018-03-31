import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PathFinder {

    public static void main(String[] args) throws IOException {


        TestCase testCase = new TestCase();

        List<TestCase> testCasesList = new ArrayList<>();

        List<String> lines = Files.readAllLines(Paths.get("sample.in"), StandardCharsets.UTF_8);

        for (int i = 0; i < lines.size(); i++) {

            List<String> splitLines = Arrays.asList(lines.get(i).split(" "));

            if (splitLines.size() == 1) {
                String personNumber = splitLines.get(0);
                testCase = new TestCase(Integer.valueOf(personNumber));
                testCasesList.add(testCase);

            } else {
                Direction direction = new Direction(Double.parseDouble(splitLines.get(3)));
                testCase.instructions.add(direction);

                MyPosition myPosition = new MyPosition();
                myPosition.setPositionX(Double.parseDouble(splitLines.get(0)));
                myPosition.setPositionY(Double.parseDouble(splitLines.get(1)));
                direction.setDirectedPosition(myPosition);

                for (int j = 4; j < splitLines.size(); j++) {
                    if (splitLines.get(j).equals("turn")) {
                        direction.facing += Double.parseDouble(splitLines.get(j + 1));
                    } else if (splitLines.get(j).equals("walk")) {
                        direction.walk(Double.parseDouble(splitLines.get(j + 1)));
                    }
                }
            }
        }

        int indexForRemove = 0;
        for (int i = 0; i < testCasesList.size(); i++) {
            TestCase item = testCasesList.get(i);
            if (item.person > 0) {
                item.calculateAveragePosition();
                item.calculateWorstDistance();
            } else {
                indexForRemove = i;
            }
        }
        testCasesList.remove(indexForRemove);
        OutputWriter writer = new OutputWriter();
        writer.writeOutputData(testCasesList, "output.txt");
    }
}


