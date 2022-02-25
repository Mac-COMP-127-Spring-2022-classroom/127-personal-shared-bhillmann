package comp127.Poly;

public abstract class Bird implements Animal {

    public void fly() {
        System.out.println("Weeee I'm flying!");
    }
    
    public Egg layEgg() {
        return new Egg(this);
    }

    // public static void main(String[] args) {
    //     Bird bird = new Bird();
    //     bird.makeNoise();
    // }

    Bird() {
        // An empty constructor this is the default in Java
    }
}
