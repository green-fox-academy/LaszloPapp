import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class RemoveToDo {
    public static void removeToDo() throws IOException {

        String inputRem = "";
        int lofasz = 0;
        boolean szamE = false;
        List<String> todoStr;
        Path mypath = Paths.get("C:\\Users\\Gemini006\\greenfox\\gemini1701\\week06\\day5\\src\\main\\java\\data.txt");
        todoStr = Files.readAllLines(mypath);

        do {
            System.out.println("Remove a task from the list by ID!");
            Scanner scTask = new Scanner(System.in);
            inputRem = scTask.next();
            try{
                lofasz = Integer.parseInt(inputRem);
                szamE = true;
            }catch (NumberFormatException e){
                System.out.println("nem szam");
                szamE = false;
            }
        }while (!szamE && todoStr.size() >= lofasz && lofasz > 0);
            try{
                for (int i = 0; i < todoStr.size(); i++) {
                    if(todoStr.get(i).startsWith(inputRem));
                    todoStr.remove(i);
                }/*
                FileWriter strWriter = new FileWriter("C:\\Users\\Gemini006\\greenfox\\gemini1701\\week06\\day5\\src\\main\\java\\data.txt", false);
                for (int i = 0; i < todoStr.size(); i++) {
                    strWriter.writeLine(todoStr.get(i) + "\n");
                    strWriter.close();
                }*/
            }catch (Exception locsecs) {

            }
    }

}

