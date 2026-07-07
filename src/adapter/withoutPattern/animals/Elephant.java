package adapter.withoutPattern.animals;

import adapter.withoutPattern.interfaces.Animal;

public class Elephant implements Animal {

    public void makeSound() {
        System.out.println("Elephant trumpets.");
    }

    public void eat() {
        System.out.println("Elephant eats plants.");
    }

    public void move() {
        System.out.println("Elephant walks slowly.");
    }
}
