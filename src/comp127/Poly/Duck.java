package comp127.Poly;

public class Duck extends Bird {
    public void makeNoise() {
        System.out.println("quack");
    }

    public void duckOnlyWaddle() {
        System.out.println("Waddle like a duck!");
    }

    Duck() {
        // An empty constructor this is the default in Java
    }

    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.fly();

        Goose goose = new Goose();
        goose.fly();
    }
}
