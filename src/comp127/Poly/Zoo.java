package comp127.Poly;

import java.util.List;

public class Zoo {
    public static void main(String[] args) {
        // Create our animals
        // Animal jogi = new Bear();
        Duck donald = new Duck();
        // Bird greyDuck = new Goose();

        donald.duckOnlyWaddle();

        Bird babyDonald = donald.layEgg().hatch();
        babyDonald.makeNoise();
        babyDonald.fly();
        babyDonald.duckOnlyWaddle();

        Bird babyBabyBabyDonald = babyDonald.layEgg().hatch().layEgg().hatch();
        babyBabyBabyDonald.fly();

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
