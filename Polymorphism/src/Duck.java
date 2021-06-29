public class Duck extends Animal{

    public  Duck(){
        super("Duck");
        this.sound = "Quack quack";
    }

    @Override
    public void eat() {
        System.out.println("mnnmaanaanmnann seeds" + this.sound);
    }

    @Override
    public void move() {
        System.out.println("Duck moves by flying");
    }
}
