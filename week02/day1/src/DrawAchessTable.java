public class DrawAchessTable {

    public static void main(String[] args) {



        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 4; j++) {
                if (i%2!=0) {
                    System.out.print(" $");
                } else {
                    System.out.print("$ ");
                }

            }
            System.out.println();
        }
    }
}


