package adapter.withpattern.adapters;

import adapter.withpattern.interfaces.Animal;
import adapter.withpattern.interfaces.Bird;

public class BirdAdapter implements Animal {

    private Bird bird;

    public BirdAdapter(Bird bird) {
        this.bird = bird;
    }

    public void makeSound() {
        bird.chirp();
    }

    public void eat() {
        bird.peck();
    }

    public void move() {
        bird.fly();
    }
}
