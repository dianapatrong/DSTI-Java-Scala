import java.util.LinkedList;

public class Farm {

    private LinkedList<Animal> animals;
    public Farm(){
        this.animals = new LinkedList<>();
    }

    public int numberOfAnimals(){
        return this.animals.size();
    }

    public void addAnima (Animal a){
        this.animals.add(a);
    }

    public void dailyCycle(){
        for (Animal a: this.animals) {
            System.out.println(a );
            a.move();
            a.eat();
            a.move();
        }
    }
}
