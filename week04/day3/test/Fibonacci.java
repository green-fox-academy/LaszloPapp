

public class Fibonacci {

    private int pos;

    public static int fibonaPos(int input) {

        if (input <= 1) {
            return input;
        } else {
            return fibonaPos(input - 1) + fibonaPos(input - 2);

        }

    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }
}
