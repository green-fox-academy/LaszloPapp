// Create a function that takes 3 parameters: a path, a word and a number,
// than it should write to a file.
// The path parameter should be a string, that describes the location of the file.
// The word parameter should be a string, that will be written to the file as lines
// The number parameter should describe how many lines the file should have.
// So if the word is "apple" and the number is 5, than it should write 5 lines
// to the file and each line should be "apple"
// The function should not raise any error if it could not write the file.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class WriteMultipleLines{
    public static void main(String[] args) {

        Path myPath = Paths.get("my-file.txt");
        String apple = "apple";
        int lineNum = 5;

        fileWriter(myPath, apple, lineNum);

    }
    static void fileWriter(Path inPath, String inWord, int inLineNum) {

        List<String> newList = new ArrayList<>();
        newList.add(inWord);

        for (int i = 0; i < inLineNum; i++) {

            try {
                Files.write(inPath, newList, StandardOpenOption.APPEND);

            } catch (IOException e) {
            }

        }

    }
}