// Write a recursive function that takes one parameter: n and counts down from n.

public class Counter{

    public static void main(String[] args) {

        Counter recurseTool = new Counter();

        recurseTool.countDown(4);


    }

    public static int countDown(int input){
        if(input == 0){
            return 1;
        }
        System.out.println(input);
        return countDown(input-1);

    }

}
