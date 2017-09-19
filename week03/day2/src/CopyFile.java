import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows i
public class CopyFile{

    public static void main(String[] args) {

        Path myPath = Paths.get("my-file.txt");
        Path myPath2 = Paths.get("my-file2.txt");

        fileCopy(myPath, myPath2);

    }

    static void fileCopy(Path inPath, Path outPath) {


        try {
            Files.copy(inPath, outPath);
            System.out.println(true);
        } catch (IOException ex) {
            System.out.println(false);
        }

    }

    }

// Write a function that copies a file to an other

// It should take the filenames as parameters

// It should return a boolean that shows if the copy was successful