package comp127.Poly;

public class Bird implements Animal {
    public void makeNoise() {
        System.out.println("Make noise like a Bird");
    }

    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.makeNoise();
    }

    Bird() {
        // An empty constructor this is the default in Java
    }
}
