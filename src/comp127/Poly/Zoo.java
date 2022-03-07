package comp127.Poly;

import java.util.List;

public class Zoo {
    public static void main(String[] args) {
        // Create our animals
        // Animal jogi = new Bear();
        Bird donald = new Duck();
        // Bird greyDuck = new Goose();

        Bird babyDonald = donald.layEgg().hatch();
        babyDonald.makeNoise();
        babyDonald.fly();

        babyDonald.walk();

        // // Have the animals make noise
        // System.out.println("One at a time: ");
        // jogi.makeNoise();
        // donald.makeNoise();
        // greyDuck.makeNoise();

        // System.out.println("For loop with Animals:");
        // List<Animal> zoo = List.of(jogi, donald, greyDuck);
        // // animal is polymorphic changing between types
        // for (Animal polymorphicVariable : zoo) {
        //     polymorphicVariable.makeNoise();
        // }
    }
}
