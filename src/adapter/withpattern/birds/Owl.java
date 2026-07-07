package adapter.withpattern.birds;

import adapter.withpattern.interfaces.Bird;

public class Owl implements Bird {

    public void chirp() {
        System.out.println("Owl hoots.");
    }

    public void peck() {
        System.out.println("Owl pecks at its meal.");
    }

    public void fly() {
        System.out.println("Owl flies silently at night.");
    }
}
