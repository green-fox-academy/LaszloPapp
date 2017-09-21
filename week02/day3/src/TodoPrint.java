public class TodoPrint {

    public static void main(String... args){

        String todoText = " - Buy milk\n";

        System.out.println("My todo:");

        if(todoText.endsWith("\n")) {
            System.out.println(" - Buy milk");
        }

        if(todoText.endsWith("\n")) {
            System.out.println(" - Download games");
        }

        if(todoText.endsWith("\n")) {
            System.out.println(" - Diablo");
        }

    }

}
