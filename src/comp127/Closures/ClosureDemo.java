package comp127.Closures;

public class ClosureDemo {
    public static void closureArgument(ClosureInterface lambda) {
        lambda.doublePrint();
        lambda.doublePrint();
    }

    public static void main(String[] args) {

        // 1. Allows us to treat functions as a class
        // 2. Can create a function without a class
        // 3. Code created now can be executed later

        // Syntax
        // (argumentList) -> {functionBody};

        String x = "Context is outside the closure!";

        ClosureInterface lambda = () -> {
            System.out.println("Hello from the closure!");
            System.out.println(x);
        };

        // Call the closure
        closureArgument(lambda);
    }
}
