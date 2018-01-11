import Plant.Plant;

//Trees class inherited from Plants
public class Trees extends Plant{

    //constructor
    public Trees(String color, float waterAmount){
        super(color, waterAmount);

    }

    public @Override void ShowState(){

        if(waterAmount<10){
            System.out.println("The " + color + " tree needs water.");
        }else{
            System.out.println("The " + color + " tree doesn't needs water");
        }
    }

}
