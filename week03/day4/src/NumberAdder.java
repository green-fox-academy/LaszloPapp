// Write a recursive function that takes one parameter: n and adds numbers from 1 to n.

public class NumberAdder {

    public static void main(String[] args) {

        NumberAdder recurseTool = new NumberAdder();
        recurseTool.numAdd(2);


    }

    static int numAdd(int input){

    if(input == 20){
        return 1;
    }
        System.out.println(input);
        return numAdd(input+1);
    }

}