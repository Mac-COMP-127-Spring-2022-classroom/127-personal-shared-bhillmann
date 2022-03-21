package comp127.PiDay;

public class BakePi {
    public static void main(String[] args) {

        // Need to initialize to get more accurate
        MonteCarloPi pi = new MonteCarloPi();

        // What happens if I call pi without simulating?
        System.out.println("This is Pi without initializing: " + pi.getPi());

        // The return type of pi.getPi() is of double with a lowercase d
        // any primitive types such as (boolean, int, long, double, float) can't be null
        // turning them into the capital version is called `boxing` and allows the value to be null
        // (Boolean, Integer, Long, Double, Float)
        // try switching the declaration to:
        // public Double getPi() {
        // What happens?

        // let us try simulating
        pi.simulate(1_000);

        System.out.println("Current current value of pi.getPi(): " + pi.getPi());
        System.out.println("After a total of this number of simulations: " + pi.getTotalIterations());


        pi.simulate(10_000_000);

        System.out.println("Current value of pi.getPi(): " + pi.getPi());
        System.out.println("After a total of this number of simulations: " + pi.getTotalIterations());
    }
}
