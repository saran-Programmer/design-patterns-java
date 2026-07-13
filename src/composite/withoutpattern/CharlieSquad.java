package composite.withoutpattern;

public class CharlieSquad {

    private InfantrySoldier firstInfantrySoldier = new InfantrySoldier();
    private InfantrySoldier secondInfantrySoldier = new InfantrySoldier();

    public void attack() {
        firstInfantrySoldier.attack();
        secondInfantrySoldier.attack();
    }

    public void move() {
        firstInfantrySoldier.move();
        secondInfantrySoldier.move();
    }

    public void displayDetails() {
        System.out.println("Charlie Squad");
        firstInfantrySoldier.displayDetails();
        secondInfantrySoldier.displayDetails();
    }
}
