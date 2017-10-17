//import main.java.animals.*;

public class Zoo {

    public static void main(String[] args) {

        Reptile reptile = new Reptile("Crocodile");
        Mammal mammal = new Mammal("Koala");
        Bird bird = new Bird("Parrot");

        System.out.println("Who want a baby?");
        System.out.println(reptile.getName() + ", " + reptile.wantChild());
        System.out.println(mammal.getName() + ", " + mammal.wantChild());
        System.out.println(bird.getName() + ", " + bird.wantChild());
    }
}
