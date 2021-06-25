// Aggregation
public class Car {

    private Wheel[] wheels = new Wheel[4];

    public Car(){

    }

    public Car(Wheel w0, Wheel w1, Wheel w2, Wheel w3){
        this.wheels[0] = w0;
        this.wheels[1] = w1;
        this.wheels[2] = w2;
        this.wheels[3] = w3;
    }

    public void drive(){
        for (Wheel w: this.wheels){
            if( w != null){
                w.drive();
            }
        }
    }
}
