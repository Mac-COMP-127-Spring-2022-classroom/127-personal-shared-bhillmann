package comp127.BicycleModel;

public class BicycleUser {

    // hidden state + visible state <- encapsulation
    // encapsulation helps:
    // - create an abstraction
    // - enforce seperation of concerns/division of labor
    public static void main(String[] args) {
        Bicycle myBike = new Bicycle();

        // myBike.speed;

        Bicycle withoutDefaultsBike = new Bicycle(1.0, 2, 3);

        // // static access to a variable
        // double myBikeDrag = myBike.DRAG;
        // double drag = Bicycle.DRAG;

        System.out.println(myBike.getSpeed());

        for (int i = 0; i < 1000; i++) {
            myBike.pedalHarder();
        }

        System.out.println(myBike.getSpeed());
    }
}
