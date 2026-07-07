package adapter.withoutPattern.manager;

import adapter.withoutPattern.interfaces.Animal;
import adapter.withoutPattern.interfaces.Bird;

public class SanctuaryManager {

    public void produceSound(Object livingBeing) {
        if (livingBeing instanceof Animal) {
            Animal animal = (Animal) livingBeing;
            animal.makeSound();
        } else if (livingBeing instanceof Bird) {
            Bird bird = (Bird) livingBeing;
            bird.chirp();
        }
    }

    public void feed(Object livingBeing) {
        if (livingBeing instanceof Animal) {
            Animal animal = (Animal) livingBeing;
            animal.eat();
        } else if (livingBeing instanceof Bird) {
            Bird bird = (Bird) livingBeing;
            bird.peck();
        }
    }

    public void move(Object livingBeing) {
        if (livingBeing instanceof Animal) {
            Animal animal = (Animal) livingBeing;
            animal.move();
        } else if (livingBeing instanceof Bird) {
            Bird bird = (Bird) livingBeing;
            bird.fly();
        }
    }
}
