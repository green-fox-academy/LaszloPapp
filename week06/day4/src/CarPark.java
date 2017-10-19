import java.util.ArrayList;

public class CarPark {

    public static void fillPark(){

        ArrayList<String> carPark = new ArrayList<>();


        for (int i = 1; i < 256; i++) {
            Car car = new Car();
                carPark.add(car.carTostring());
        }
        System.out.println(carPark);

        for (int i = 0; i < carPark.size(); i++) {
            
        }
    }
}
