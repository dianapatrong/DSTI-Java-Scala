// Aggregation
public class Wheel {
    private Car attachedTo;

    public Wheel(){

    }

    public Wheel(Car c){
        this.attachedTo = c;
    }

    public void drive(){
        // Dependency to Car
        if(this.attachedTo == null){
            return;
        }
    }
}
