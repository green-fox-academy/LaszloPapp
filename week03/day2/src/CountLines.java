import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.

public class CountLines {
    public static void main(String[] args) {

     //   Scanner scanner = new Scanner(System.in);


        System.out.println(linesNum("src/my-file.txt"));

    }

    static int linesNum(String input){
        int lineCount = 0;
    try{
        Path filePath = Paths.get(input);
        List<String> lines = Files.readAllLines(filePath);
    for (int i = 0; i < lines.size(); i++) {
        lineCount=i;
    }
    return lineCount;
    } catch (IOException e) {
    return 0;
    }

    }

}