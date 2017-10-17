import java.util.ArrayList;

public class PallidaClass {

    String className;
    ArrayList<Student> students;
    ArrayList<Mentor> mentors;

    public PallidaClass(String className){

        this.className = className;
        students = new ArrayList<>();
        mentors = new ArrayList<>();

    }


    public void addStudent(Student student){

        students.add(student);

    }

    public void addMentor(Mentor mentor){

        mentors.add(mentor);

    }

    public void info(){

        System.out.println(students.size());
        System.out.println(mentors.size());

    }

}
