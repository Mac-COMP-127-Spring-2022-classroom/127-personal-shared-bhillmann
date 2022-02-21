package comp127.Poly;

public class Zoo {
    public static void main(String[] args) {
        // Create our animals
        Bear jogi = new Bear();
        Bird donald = new Duck();
        Bird greyDuck = new Goose();

        // Have the animals make noise
        System.out.println("One at a time: ");
        jogi.makeNoise();
        donald.makeNoise();
        greyDuck.makeNoise();
    }
}
