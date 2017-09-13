import java.util.*;

public class Candyshop {

    public static void main(String... args){

        ArrayList<Object> arrayList = new ArrayList<>();

        arrayList.add("Cupcake");

        arrayList.add(2);

        arrayList.add("Brownie");

        arrayList.add(false);

        arrayList.set( 1, "Croissant" );

        arrayList.set( 3, "Ice cream" );


        System.out.println(arrayList);

    }

}
