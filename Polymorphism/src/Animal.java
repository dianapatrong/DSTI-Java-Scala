public abstract class Animal {
    protected  String sound;
    private String kind;

    public Animal(String kind){
        this.kind = kind;
    }
    public abstract void eat();
    public abstract void move();
    public String getSound(){
        return this.sound;
    }

    @Override
    public String toString(){
        return "This animal is a " + this.kind;
    }
}
