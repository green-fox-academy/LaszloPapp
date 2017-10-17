public abstract class Animal {
    String name;
    int age;
    
    public Animal(String name){
        this.name = name;
    }

    public Animal() {
        
    }

    public void greet(){

    }

    public String getName() {
        return name;
    }

    public String wantChild(){
        return "by eggs";
    }
}
