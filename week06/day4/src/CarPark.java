import java.util.ArrayList;
import java.util.HashMap;

public class CarPark {

    public static void parkStatus(){

        ArrayList<String> carPark = new ArrayList<>();

        for (int i = 0; i < 255; i++) {
            Car car = new Car();
                carPark.add(car.carTostring());
        }
        System.out.print(carPark);
        System.out.println(carCounter(carPark));
        colorCounter(carPark);
    }

    public static HashMap<Integer, String> carCounter(ArrayList<String> input){

        HashMap<Integer, String> carTypes = new HashMap<>();

        int merciCounter = 0;
        int bmwCounter = 0;
        int ignisCounter = 0;
        int suzukiCounter = 0;

        for (int i = 0; i < input.size(); i++) {
            if(input.get(i).contains("MERCEDES")){
                merciCounter++;
            }else if (input.get(i).contains("BMW")){
                bmwCounter++;
            }else if (input.get(i).contains("IGNIS")){
                ignisCounter++;
            }else if (input.get(i).contains("SUZUKI")){
                suzukiCounter++;
            }
        }
        carTypes.put(merciCounter," Merci");
        carTypes.put(bmwCounter," BMW");
        carTypes.put(ignisCounter," Ignis");
        carTypes.put(suzukiCounter," Suzuki");

        System.out.println(carTypes);

        return carTypes;
    }

    public static HashMap<Integer, String> colorCounter(ArrayList<String> input){

        HashMap<Integer, String> carColors = new HashMap<>();

        int greyCounter = 0;
        int redCounter = 0;
        int blackCounter = 0;
        int pinkCounter = 0;

        for (int i = 0; i < input.size(); i++) {
            if(input.get(i).contains("GREY")){
                greyCounter++;
            }else if (input.get(i).contains("RED")){
                redCounter++;
            }else if (input.get(i).contains("BLACK")){
                blackCounter++;
            }else if (input.get(i).contains("PINK")){
                pinkCounter++;
            }
        }
        carColors.put(greyCounter," Grey");
        carColors.put(redCounter," Red");
        carColors.put(blackCounter," Black");
        carColors.put(pinkCounter," Pink");

        System.out.println(carColors);

        return carColors;
    }

}
