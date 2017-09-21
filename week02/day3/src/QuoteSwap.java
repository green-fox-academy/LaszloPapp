import java.util.*;



    public class QuoteSwap{

        public static void main(String... args){

            ArrayList<String> list = new ArrayList<>(Arrays.asList("What", "I", "do", "create,", "I", "cannot", "not", "understand."));

            list.remove(6);
            list.add(3, "not");

            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i)+" ");
            }

        }
}


// Accidentally I messed up this quote from Richard Feynman.

// Two words are out of place

// Your task is to fix it by swapping the right words with code

// "What", "I", "do", "not", "create,", "I", "cannot", "understand."

// Also, print the sentence to the output with spaces in between.