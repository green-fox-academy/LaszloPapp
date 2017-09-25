public class Animal {

    int hunger = 50;
    int thirst = 50;

    public Animal(){

    }

    public void eat(int hunger){

        this.hunger -= 1;

    }

    public void drink(int thirst){

        this.thirst -= 1;

    }

    public void play(int hunger, int thirst){

        this.hunger += 1;
        this.thirst += 1;

    }

}
