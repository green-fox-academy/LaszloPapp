import java.util.Random;

public class Car {

    Random randomt = new Random();
    int t = randomt.nextInt(3);
    Random randomc = new Random();
    int c = randomc.nextInt(3);

    public enum CarTypes{MERCEDES,BMW,IGNIS,SUZUKI}
    public enum CarColors{GREY,RED,BLACK,PINK}

    String type;
    String color;

    public Car(){
        this.type = getType();
        this.color = getColor();
    }

    public String getType() {
        type = CarTypes.values()[t].toString();
        return type;
    }

    public String getColor() {
        color = CarColors.values()[c].toString();
        return color;
    }

    public String carTostring(){
        return getType() + " " + getColor();
    }
}
