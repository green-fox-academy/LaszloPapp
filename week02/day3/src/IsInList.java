import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;

public class IsInList {


    public static void main(String... args){

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));


        int[] num = {4, 8, 12, 16};

        boolean mindBenneVan = true;

        for (int i = 0; i < num.length; i++) {
            if (list.contains(num[i]) == false) {
                mindBenneVan = false;
            }
        }

        System.out.println(mindBenneVan);


        // Check if list contains all of the following elements: 4,8,12,16

        // Print "true" if it contains all, otherwise print "false"

        // Can you do both the different approaches you tried in the previous one?



    }

}
