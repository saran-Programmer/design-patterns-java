package adapter.withpattern.manager;

import adapter.withpattern.interfaces.Animal;

public class SanctuaryManager {

    public void produceSound(Animal animal) {
        animal.makeSound();
    }

    public void feed(Animal animal) {
        animal.eat();
    }

    public void move(Animal animal) {
        animal.move();
    }
}
