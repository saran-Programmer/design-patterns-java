package composite.withoutpattern;

public class TaskForceNorth {

    private AlphaSquad alphaSquad = new AlphaSquad();
    private BravoSquad bravoSquad = new BravoSquad();

    public void attack() {
        alphaSquad.attack();
        bravoSquad.attack();
    }

    public void move() {
        alphaSquad.move();
        bravoSquad.move();
    }

    public void displayDetails() {
        System.out.println("Task Force North");
        alphaSquad.displayDetails();
        bravoSquad.displayDetails();
    }
}
