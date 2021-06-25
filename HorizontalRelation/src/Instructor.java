import java.util.ArrayList;
// Association
public class Instructor {

    private ArrayList<Student> students;

    public Instructor(){
        this.students = new ArrayList<>();
    }

    public void addStudent(Student s){
        this.students.add(s);
    }
}
