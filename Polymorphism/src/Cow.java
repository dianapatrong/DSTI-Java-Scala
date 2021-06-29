public class Cow extends Animal {

    public Cow(){
        super("Cow");
        this.sound = "Mooooooooo";
    }

    @Override
    public void eat() {
        System.out.println("ñam ñam ñam grass");
    }

    @Override
    public void move() {
        System.out.println("Move on its 4 legs");
    }
}
