package comp127.BicycleModel;

public class Bicycle {
    // all of my instance variables are here
    private double direction;
    private double speed;

    // // pair static and final together, we make a constant
    // // constansts are always uppercase with underscores between them
    // public final static double DRAG = 0.1;
    // public final static double PEDAL_POWER = 2.0;
    // public final static double BRAKING_POWER = 3.0;

    private final double drag;
    private final double pedalPower;
    private final double brakingPower;

    public double getDirection() {
        return this.direction;
    }

    public void setDirection(double directionParam) {
        if (directionParam > 90) {
            this.direction = 90; 
        } else if (directionParam < -90){
            this.direction = -90;
        } else {
            this.direction = directionParam;
        }
    }

    public double getSpeed() {
        return this.speed;
    }

    public void pedalHarder() {
        this.speed = (this.speed + this.pedalPower) * (1 - this.drag);
    }

    public void brake() {
        this.speed = Math.max(0, (this.speed - this.brakingPower) * (1 - this.drag));
    }   

    public Bicycle(double drag, double pedalPower, double brakingPower) {
        this.drag = drag;
        this.pedalPower = pedalPower;
        this.brakingPower = brakingPower;
    }

    public Bicycle() {
        this(0.1, 2, 3);
    }
}
