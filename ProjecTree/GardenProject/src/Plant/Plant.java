package Plant;

//Abstract parent class for flowers and trees
public abstract class Plant {
    public String color;
    public float waterAmount;

    //constructor
    public Plant(String color, float waterAmount) {
        this.color = color;
        this.waterAmount = waterAmount;
    }

    public void ShowState()
    {

    }
}
