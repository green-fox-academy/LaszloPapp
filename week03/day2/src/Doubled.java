import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import static java.nio.file.Files.lines;

public class Doubled {

    public static void main(String[] args) {
        // Create a method that decrypts the duplicated-chars.txt

        try {
            Path myPath = Paths.get("src/duplicated-chars.txt");
            List<String> lines = Files.readAllLines(myPath);
            for (int i = 0; i < lines.size(); i++) {
                for (int j = 0; j < lines.get(i).length()-1; j+=2) {
                   if(lines.get(i).charAt(j)==lines.get(i).charAt(j+1)){
                       System.out.print(lines.get(i).charAt(j));
                   }
                }
                System.out.println();
            }
        } catch (IOException e) {
            
        }

    }
}
