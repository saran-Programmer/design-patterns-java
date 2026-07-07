package adapter.withpattern.animals;

import adapter.withpattern.interfaces.Animal;

public class Lion implements Animal {

    public void makeSound() {
        System.out.println("Lion roars loudly.");
    }

    public void eat() {
        System.out.println("Lion eats meat.");
    }

    public void move() {
        System.out.println("Lion walks across the grassland.");
    }
}
