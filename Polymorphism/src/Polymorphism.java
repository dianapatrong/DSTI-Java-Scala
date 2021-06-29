public class Polymorphism {

    public static void main(String[] args){
        Farm myFarm = new Farm();
        myFarm.addAnimal(new Duck());
        myFarm.addAnimal(new Cow());
        myFarm.addAnimal(new Duck());
        myFarm.addAnimal(new Cow());
        myFarm.dailyCycle();
    }
}
