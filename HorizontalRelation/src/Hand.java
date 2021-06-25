// Composition
public class Hand {

    private Person owner;

    // Cannot create a Hand without a Person
    public Hand(Person o){
        this.owner = o;
    }
}
