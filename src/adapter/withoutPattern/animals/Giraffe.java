package adapter.withoutPattern.animals;

import adapter.withoutPattern.interfaces.Animal;

public class Giraffe implements Animal {

    public void makeSound() {
        System.out.println("Giraffe hums softly.");
    }

    public void eat() {
        System.out.println("Giraffe eats leaves from tall trees.");
    }

    public void move() {
        System.out.println("Giraffe walks with long steps.");
    }
}
