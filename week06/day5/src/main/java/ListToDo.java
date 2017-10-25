import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ListToDo {

    public static void listToDo() {
        List<String> todoStr = null;

        try {
            todoStr = Files.readAllLines(Paths.get("C:\\Users\\Gemini006\\greenfox\\gemini1701\\week06\\day5\\src\\main\\java\\data.txt"));
        } catch (IOException e) {
            e.getMessage();
        }
        if (todoStr.size() > 0) {
            for (String str : todoStr) {
                System.out.println(str);
            }
        } else {
            System.out.println("There are no ToDos today!");
        }
    }
}
