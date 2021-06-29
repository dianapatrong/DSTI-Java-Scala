import java.util.ArrayList;

public class Teacher extends Person {
    private int numCourses;
    private ArrayList<String> courses;

    public Teacher(String name, String address){
        super(name, address);
        this.courses = new ArrayList<>();
    }

    public boolean addCourse(String course){
        if (this.courses.contains(course)){
            return false;
        }
        this.courses.add(course);
        this.numCourses++;
        return true;
    }

    public boolean removeCourse(String course){
        if (!this.courses.contains(course)){
            return false;
        }
        this.courses.remove(course);
        this.numCourses--;
        return true;
    }

    @Override
    public String toString() {
        return "Teacher: " + super.toString();
    }
}
