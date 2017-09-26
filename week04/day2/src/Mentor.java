public class Mentor extends Person {

    String level;

    public Mentor(){

        level = "intermediate";

    }

    public Mentor(String name, int age, String gender, String level) {

        super.name = name;
        super.age = age;
        super.gender = gender;
        this.level = level;

    }

    public @Override void introduce() {

        System.out.println("Hi i am " + name + " a " + age + " year old " + gender + " " + level + " mentor");

    }

    public @Override void getGoal() {

        System.out.println("Educate brilliant junior software developers.");

    }
}
