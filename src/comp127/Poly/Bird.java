package comp127.Poly;

public class Bird extends Animal {
    public Egg layEgg() {
        return new Egg(this);
    }
}
