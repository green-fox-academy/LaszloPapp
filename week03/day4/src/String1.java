// Given a string, compute recursively (no loops) a new string where all the
// lowercase 'x' chars have been changed to 'y' chars.

public class String1 {

    public static void main(String[] args) {

        System.out.println(stringY("dnndkxnvxjdnxvdxn"));

}
    static String stringY(String inPut){

        if(inPut.contains("x")){
            return stringY(inPut.replaceFirst("x", "y"));
        }else{
            return inPut;
        }

    }

}