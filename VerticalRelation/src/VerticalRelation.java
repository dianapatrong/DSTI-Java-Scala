import java.util.LinkedList;

public class VerticalRelation {
    public static void main(String[] args){
        LinkedList<Animal> farm = new LinkedList<>();
        Dog mydog = new Dog();
        mydog.eat();

        farm.add(mydog);
        farm.add(new Bird());
    }
}
