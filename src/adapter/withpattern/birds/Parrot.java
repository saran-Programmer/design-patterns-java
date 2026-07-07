package adapter.withpattern.birds;

import adapter.withpattern.interfaces.Bird;

public class Parrot implements Bird {

    public void chirp() {
        System.out.println("Parrot squawks.");
    }

    public void peck() {
        System.out.println("Parrot pecks at seeds.");
    }

    public void fly() {
        System.out.println("Parrot flies between trees.");
    }
}
