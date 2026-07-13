package composite.withoutpattern;

public class BravoSquad {

    private InfantrySoldier infantrySoldier = new InfantrySoldier();
    private Engineer engineer = new Engineer();

    public void attack() {
        infantrySoldier.attack();
        engineer.attack();
    }

    public void move() {
        infantrySoldier.move();
        engineer.move();
    }

    public void displayDetails() {
        System.out.println("Bravo Squad");
        infantrySoldier.displayDetails();
        engineer.displayDetails();
    }
}
