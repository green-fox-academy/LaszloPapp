import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Scanner;

public class AddToDo {

    public static void addToDo() {

        System.out.println("Add a task for the list!");
        Scanner scTask = new Scanner(System.in);
        String inputAdd = scTask.next();

        List<String> todoStr;
        Path mypath = Paths.get("C:\\Users\\Gemini006\\greenfox\\gemini1701\\week06\\day5\\src\\main\\java\\data.txt");

        try {
            todoStr = Files.readAllLines(mypath);
            String id = Integer.toString(todoStr.size() + 1);
            String writeIn = System.getProperty("line.separator") + id + " - " + inputAdd;
            byte[] tomb = writeIn.getBytes();
            Files.write(mypath, tomb, StandardOpenOption.APPEND );
        } catch (IOException e) {
            e.getMessage();
            System.out.println("Please type your ToDo");
        } catch (IndexOutOfBoundsException e) {
            e.getMessage();
        } catch (Exception e) {
            e.getMessage();
        }
    }
}

