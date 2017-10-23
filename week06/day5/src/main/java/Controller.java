import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller implements Manipulation {

    public static void controlToDo() {

        System.out.println("Choose an option!");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        while (!(input.matches("-l")
                || input.matches("-a")
                || input.matches("-r")
                || input.matches("-c"))) {
            System.out.println("The valid arguments are: -l , -a , -r , -c. Please try again!");
            sc = new Scanner(System.in);
            input = sc.next();
        }
        if (input.matches("-l")) {
            ListToDo.listToDo();
        }
        if (input.matches("-a")) {
            AddToDo.addToDo();
        }
        if (input.matches("-r")) {
            RemoveToDo.removeToDo();
        }
        if (input.matches("-c")) {

        }
    }

    @Override
    public void readFile() {

    }

    @Override
    public void writeFile() {

    }
}
