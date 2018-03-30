import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class PathFinder {

    public static void main(String[] args) throws IOException {


        List<String> lines = Files.readAllLines(Paths.get("src\\sample.in"), StandardCharsets.UTF_8);
        for (int i = 0; i < lines.size(); i++) {
            List<String> splitLines = Arrays.asList(lines.get(i).split(" "));
            for (int j = 0; j < splitLines.size(); j++) {
            }
        }
    }
}
