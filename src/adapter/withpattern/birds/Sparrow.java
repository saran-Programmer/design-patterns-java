package adapter.withpattern.birds;

import adapter.withpattern.interfaces.Bird;

public class Sparrow implements Bird {

    public void chirp() {
        System.out.println("Sparrow chirps.");
    }

    public void peck() {
        System.out.println("Sparrow pecks at grains.");
    }

    public void fly() {
        System.out.println("Sparrow flies quickly around the aviary.");
    }
}
