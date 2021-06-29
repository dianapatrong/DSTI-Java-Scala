import java.util.ArrayList;

public class Student extends Person{
    private int numCourses;
    private ArrayList<String> courses;
    private ArrayList<Integer> grades;

    public Student(String name, String address){
        super(name, address);
        this.courses = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public void addCourseGrade(String course, int grade){
        this.courses.add(course);
        this.grades.add(grade);
        this.numCourses++;
    }

    public void printGrades(){
        for(int i=0; i<this.courses.size(); i++){
            System.out.println(this.courses.get(i)+":"+this.grades.get(i));
        }
    }

    public double getAverageGrade(){
        if (this.grades.size() ==0){
            return 0.0;
        }
        double avg=0;
        for(int i: this.grades){
            avg+=i;
        }
        return avg/this.grades.size();
    }

    @Override
    public String toString(){
        return "Student: " + super.toString();
    }
}
