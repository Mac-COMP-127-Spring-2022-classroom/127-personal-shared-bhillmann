package comp127.PiDay;

import java.util.Random;

public class StaticMonteCarloPi {
    private static final Random RANDOM = new Random();
    // total number of iterations to simulate
    public static final int NUM_ITERATIONS = 1_000_000;
    // estimate the value of PI and make it accessible
    public static final double PI = monteCarloEstimatePi(NUM_ITERATIONS);

    // methods can be static as well!
    public static double monteCarloEstimatePi(int numIterations) {
        double inCircle = 0;
        for (int i = 0; i < numIterations; i++) {
            if (1 >= Math.pow(RANDOM.nextDouble(), 2) + Math.pow(RANDOM.nextDouble(), 2))
                inCircle++;
        }
        return 4 * (inCircle / numIterations);
    }

    public static void main(String[] args) {
        System.out.println(PI);
        System.out.println(StaticMonteCarloPi.PI);
        System.out.println(StaticMonteCarloPi.monteCarloEstimatePi(1_000));

        // StaticMonteCarloPi staticPi = new StaticMonteCarloPi();
        // StaticMonteCarloPi.PI;

        System.out.println(Math.PI);
    }
}
