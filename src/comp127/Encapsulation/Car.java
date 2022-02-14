package comp127.Encapsulation;

public class Car {
    // state
    // initially declared as public
    private double speed;

    // behavior
    public void pushBrake() {
        this.speed -= 1;
    }

    public void pushPedal() {
        this.speed += 1;
    }

    // getters
    public double getSpeed() {
        return this.speed;
    }

    // // setters
    // public void setSpeed(double speed) {
    //     this.speed = speed;
    // }

    // constructors
    Car() {
        this(0.0);
    }


    Car(double speed) {
        this.speed = speed;
    }
    
}
