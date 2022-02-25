package comp127.Poly;

public class Egg {
    Bird babyAnimal;

    Egg(Bird babyAnimal) {
        this.babyAnimal = babyAnimal;
    }

    public Bird hatch() {
        return this.babyAnimal;
    }
}
