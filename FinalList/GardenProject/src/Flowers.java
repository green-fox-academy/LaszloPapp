import Plant.Plant;

//Flowers class inherited from Plants class
public class Flowers extends Plant{

    //constructor
    public Flowers(String color, float waterAmount) {
        super(color, waterAmount);
    }

    public @Override void ShowState(){

        if(waterAmount<5){
            System.out.println("The " + color + " flower needs water.");
        }else{
            System.out.println("The " + color + " flower doesn't needs water");
        }
    }
}
