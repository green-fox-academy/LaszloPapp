

public class Fibonacci {

    int input;

    public Fibonacci(int input){

        this.input = input;
    }

    public int fibonaPos() {

        int index = (input-1)+(input-2);

        if (input <= 1) {
            return input;
        }return index;


    }

 /*   public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    } */
}
