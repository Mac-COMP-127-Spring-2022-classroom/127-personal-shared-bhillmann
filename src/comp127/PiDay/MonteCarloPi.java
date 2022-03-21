package comp127.PiDay;
import java.util.Random;

public class MonteCarloPi {
    // capital D in Double declaration allows us to have the instance variable pi be 'null'
    private double pi;

    private static final Random RANDOM = new Random();

    private Double totalInCircle = 0.0;
    private Double totalIterations = 0.0;

    public void simulate(int numIterations) {
        for (int i = 0; i < numIterations; i++) {
            if (1 >= Math.pow(RANDOM.nextDouble(), 2) + Math.pow(RANDOM.nextDouble(), 2))
                totalInCircle++;
            totalIterations++;
        }
        pi = 4 * (totalInCircle / totalIterations);
    }

    public Double getPi() {
        // if (this.pi == null)
        //     return 0.0;
        return this.pi;
    }

    public Double getTotalIterations() {
        return totalIterations;
    }
}
    
