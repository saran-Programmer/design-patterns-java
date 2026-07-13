package composite.withpattern;

public class Sniper implements MilitaryComponent {

    public void attack() {
        System.out.println("Sniper attacks from long range.");
    }

    public void move() {
        System.out.println("Sniper moves to a protected position.");
    }

    public void displayDetails() {
        System.out.println("Sniper");
    }
}
