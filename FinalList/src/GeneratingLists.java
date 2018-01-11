import java.util.*;

public class GeneratingLists{
  public static void main(String... args){
    ArrayList<String> list = new ArrayList<>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

    String temp = list.get(5);
    list.set(5, list.get(2));
    list.set(2, temp);

    String quote = "";
    for(int i = 0; i < list.size(); i++) {
      quote = quote.concat(list.get(i) + " ");
    }
    System.out.println(quote);
  }
}
// Accidentally I messed up this quote from Richard Feynman.
// Two words are out of place
// Your task is to fix it by swapping the right words with code
// Also, print the sentence to the output with spaces in between.
