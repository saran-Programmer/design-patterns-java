package adapter.withoutPattern.birds;

import adapter.withoutPattern.interfaces.Bird;

public class Eagle implements Bird {

    public void chirp() {
        System.out.println("Eagle screeches.");
    }

    public void peck() {
        System.out.println("Eagle pecks at its food.");
    }

    public void fly() {
        System.out.println("Eagle flies high above the sanctuary.");
    }
}
