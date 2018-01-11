import Plant.Plant;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //creating a garden
        Garden garden = new Garden();

        //creating new Plant List, filling up and adding to the garden's plants List
        garden.plants = new ArrayList<Plant>() {
            {
                add(new Flowers("yellow", 0));
                add(new Flowers("blue", 0));
                add(new Trees("purple", 0));
                add(new Trees("orange", 0));

            }
        };

        garden.Lister();
        garden.WaterThem(40);
        garden.Lister();
        garden.WaterThem(70);
        garden.Lister();


    }

}
