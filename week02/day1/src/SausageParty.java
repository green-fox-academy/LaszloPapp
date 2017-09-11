import java.util.Scanner;

public class SausageParty {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("How many girls?");

        int girlNum = sc.nextInt();

            System.out.println("How many boys?");

        int boyNum = sc.nextInt();


        if((girlNum==boyNum)&&((girlNum+boyNum)>20)){
            System.out.println("The party is exellent!");
        }else if ((girlNum!=boyNum)&&((girlNum+boyNum)>20)){
            System.out.println("Quite cool party!");
        }else if ((girlNum+boyNum)>20){
            System.out.println("Average party...");
        }else if (girlNum==0){
            System.out.println("Sausage party");
        }else{
            System.out.println("Bad party...");
        }
    }
}
