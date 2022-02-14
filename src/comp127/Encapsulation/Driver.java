package comp127.Encapsulation;

public class Driver {
    public static void main(String[] args) {
        Car car = new Car();
        Car carFast = new Car(100.0);

        System.out.println("Speed of the carFast: " + carFast.getSpeed());

        // can only access car.speed because it is public
        System.out.println("Speed of the car: " + car.getSpeed());

        // car.setSpeed(car.getSpeed() + 10);
        // car.setSpeed(car.getSpeed() * 2); // car.speed *= 2;


        for (int i = 0; i < 100; i++) {
            car.pushPedal();
            car.pushPedal();
            car.pushBrake();
        }

        System.out.println("Speed of the car after pushing the pedal: " + car.getSpeed());
        System.out.println("Speed of the carFast remainds unchanged: " + carFast.getSpeed());

    }
    
}
