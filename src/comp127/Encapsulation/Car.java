package comp127.Encapsulation;

public class Car {
    // state
    // initially declared as public
    private double speed;

    // behavoir
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

    // constructor
    Car() {
        this.speed = 0;
    }

    Car(double speed) {
        this.speed = speed;
    }
    
}
