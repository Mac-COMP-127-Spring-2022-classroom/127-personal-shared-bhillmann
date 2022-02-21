package comp127.Poly;

public class Egg {
    private Animal babyAnimal;
    
    public Animal hatch() {
        return babyAnimal;
    }

    public Egg(Animal babyAnimal) {
        this.babyAnimal = babyAnimal;
    }
}
