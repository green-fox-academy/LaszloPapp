public class Sponsor extends Person {

    String company;
    int hiredStudents;

    public Sponsor(){

        company = "Google";
        hiredStudents = 0;

    }

    public Sponsor(String name, int age, String gender, String company) {

        super.name = name;
        super.age = age;
        super.gender = gender;
        this.company = company;


    }

    public @Override void introduce(){

        System.out.println("Hi i am " + name + " a " + age + " year old " + gender + " who represents " + company
                + " and hired " + hiredStudents + " students so far.");

    }

    public @Override void getGoal(){

        System.out.println("Hire brilliant junior software developers.");

    }

    public void hire() {

        hiredStudents++;

    }
}
