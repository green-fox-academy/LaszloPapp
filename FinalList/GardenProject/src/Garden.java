import Plant.Plant;

import java.util.ArrayList;

//Garden class
public class Garden {

    ArrayList<Plant> plants;

    public Garden(){

    }
    //Method for writing the state of the elements to the console
    public void Lister(){

        for (int i = 0; i < plants.size(); i++) {
            plants.get(i).ShowState();
        }

    }

    //Method for adding water for every element in the ArrayList
    public void WaterThem(int wateringAmount) {
        System.out.println();
        System.out.println("Watering with " + wateringAmount);

        //temporary list for plants what needs water
        ArrayList<Plant> plantsNeedsWater = new ArrayList<Plant>();

        //for loop for finding the plants what needs water
        for (int i = 0; i < plants.size(); i++) {
            //determine the element's class
            if(plants.get(i) instanceof Flowers){
                if(plants.get(i).waterAmount < 5) {
                plantsNeedsWater.add(plants.get(i));
                }
            }
            else{
                if(plants.get(i).waterAmount < 10)
                    plantsNeedsWater.add(plants.get(i));
            }
        }

        //needs a null check - if there are no plants what needs water the program skips this
        if(plantsNeedsWater.size() != 0){
            float waterPerPlant = wateringAmount/plantsNeedsWater.size();
            for (int i = 0; i < plantsNeedsWater.size(); i++) {
                if(plantsNeedsWater.get(i) instanceof Flowers){
                    plantsNeedsWater.get(i).waterAmount+=waterPerPlant*0.75;
                }else{
                    plantsNeedsWater.get(i).waterAmount+=waterPerPlant*0.4;
                }
            }
        }
    }
}
