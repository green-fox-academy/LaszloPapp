public class GreeterFunction {

    public static void main(String[] args) {

        String al = "Greenfox";

        // - Create a string variable named `al` and assign the value `Greenfox` to it

        // - Create a function called `greet` that greets it's input parameter

        //     - Greeting is printing e.g. `Greetings dear, Greenfox`

        // - Greet `al`

        System.out.println(greet(al));

    }

    static String greet(String input){
        String greetString = "Greetings dear, "+input;


        return greetString;
    }

}
