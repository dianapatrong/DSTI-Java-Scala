import java.util.LinkedList;

public class PersonInherit {
    public static void main(String[] args){
        LinkedList<Person> cohort =  new LinkedList<>();
        cohort.add(new Student("Diana", "Mexico"));
        cohort.add(new Teacher("Clement", "Paris"));

        for(Person p: cohort){
            System.out.println(p);
        }
    }
}
