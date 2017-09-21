// We have a number of bunnies and each bunny has two big floppy ears.
// We want to compute the total number of ears across all the bunnies recursively (without loops or multiplication).
public class Bunny1{

    public static void main(String[] args) {

        System.out.println(bunnyEarCount(6));

    }

    static int bunnyEarCount(int bunnyIn){
        int ear = 2;

        if(bunnyIn==0){
            return 0;
        }else{
            return ear+bunnyEarCount(bunnyIn-1);
        }
    }

}