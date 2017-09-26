public class Student extends Person{

    String previousOrganization;
    int skippedDays;

    public Student(){
        
        name = "Jane Doe";
        age = 30;
        gender = "female";

    }

    public Student(String name, int days){

        previousOrganization = "The school of life";
        skippedDays = 0;

    }

    public Student(String name, int age, String gender, String previousOrganization) {

        super.name = name;
        super.age = age;
        super.gender = gender;
        this.previousOrganization = previousOrganization;


    }

    public @Override void introduce(){

        System.out.println("Hi i am " + name + " a " + age + " years old " + gender + " from " + previousOrganization +
        " who skipped " + skippedDays + " days from the course already");

    }

    public @Override void getGoal(){

        System.out.println("Be a junior software developer.");

    }

    public void skipDays(int numberOfDays){

        skippedDays++;

    }

    public void skippedDays(int i) {
    }
}
