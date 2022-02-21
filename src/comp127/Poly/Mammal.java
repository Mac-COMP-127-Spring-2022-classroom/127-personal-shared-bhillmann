package comp127.Poly;

public class Mammal extends Animal {
    public void makeNoise() {
        System.out.println("Regular Mammal need noise to make!");
    }

    public static void main(String[] args) {
        Mammal mammal = new Mammal();
        mammal.makeNoise();
    }
    
}
