package composite.withpattern;

public class Medic implements MilitaryComponent {

    public void attack() {
        System.out.println("Medic protects the unit while providing support.");
    }

    public void move() {
        System.out.println("Medic moves with medical supplies.");
    }

    public void displayDetails() {
        System.out.println("Medic");
    }
}
