import java.util.ArrayList;
// Association
public class Student {

    private ArrayList<Instructor> teacher;

    public Student(){
        this.teacher = new ArrayList<>();
    }

    public void addInstructor(Instructor i){
        this.teacher.add(i);
        i.addStudent(this);
    }
}
