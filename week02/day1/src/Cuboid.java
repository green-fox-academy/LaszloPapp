public class Cuboid {

    public static void main(String[] args) {

        double longSide = 10;
        double shortSide = 7;
        double heightSide = 5;

        double surfaceArea = 2*((longSide*shortSide)+(shortSide*heightSide)+(heightSide*longSide));

                System.out.println("Surface area is: " + surfaceArea);

        double cuboidVolume = longSide*shortSide*heightSide;

                System.out.println("Volume is: " + cuboidVolume);

    }

}
