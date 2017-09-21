// Given a string, compute recursively a new string where all the 'x' chars have been removed.

public class String2{

    public static void main(String[] args) {

        System.out.println(charRemove("shbfxsjxhdxsbxv"));

    }

    static String charRemove(String input){

        if(input.contains("x")){
            return charRemove(input.replaceFirst("x", ""));
        }else{
            return input;
        }
    }

}