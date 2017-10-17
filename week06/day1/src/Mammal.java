public class Mammal extends Animal{

    public Mammal(String name) {
        super(name);
    }

    @Override
    public String wantChild(){
        return "by an other mammal";
    }
}
