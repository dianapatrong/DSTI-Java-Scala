// Composition
public class Person {
    private Hand left;
    private Hand right;

    public Person(){

    }

    public Person(int nbHand){
        if (nbHand == 1){
            this.left = new Hand(this);
        }
        else {
            this.left = new Hand(this);
            this.right = new Hand(this);
        }
    }
}
