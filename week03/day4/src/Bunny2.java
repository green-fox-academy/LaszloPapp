// We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
// (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
// have 3 ears, because they each have a raised foot. Recursively return the
// number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

public class Bunny2{

    public static void main(String[] args) {

        System.out.println(bunnyEarCounter(3));

    }

    static int bunnyEarCounter(int bunnyIn) {

        int oddBunnyEar = 2;
        int evenBunnyEar = 3;

        if (bunnyIn == 0) {
            return 0;
        }
        if (bunnyIn % 2 == 0) {
            return evenBunnyEar + bunnyEarCounter(bunnyIn - 1);
        }else{
            return oddBunnyEar + bunnyEarCounter(bunnyIn - 1);
    }


    }

}