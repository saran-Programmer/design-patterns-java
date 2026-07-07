package adapter.withoutPattern.animals;

import adapter.withoutPattern.interfaces.Animal;

public class Zebra implements Animal {

    public void makeSound() {
        System.out.println("Zebra brays.");
    }

    public void eat() {
        System.out.println("Zebra eats grass.");
    }

    public void move() {
        System.out.println("Zebra runs in the field.");
    }
}
