public class Colors {

    public static void main(String[] args){

        int columns = 2;
        int rows = 2;

        String[][] newArray = new String[columns][rows];

        newArray[0][0] = "lime";
        newArray[0][1] = "orange red";

        newArray[1][0] = "orchid";
        newArray[1][1] = "forest green";

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println(newArray[i][j]);
            }
            
        }

        // - Create a two dimensional array
        //   which can contain the different shades of specified colors

        // - In `colors[0]` store the shades of green:
        //   `"lime", "forest green", "olive", "pale green", "spring green"`

        // - In `colors[1]` store the shades of red:
        //   `"orange red", "red", "tomato"`

        // - In `colors[2]` store the shades of pink:
        //   `"orchid", "violet", "pink", "hot pink"`

    }

}
