package composite.withoutpattern;

public class MainBattalion {

    private TaskForceNorth taskForceNorth = new TaskForceNorth();
    private CharlieSquad charlieSquad = new CharlieSquad();

    public void attack() {
        taskForceNorth.attack();
        charlieSquad.attack();
    }

    public void move() {
        taskForceNorth.move();
        charlieSquad.move();
    }

    public void displayDetails() {
        System.out.println("Main Battalion");
        taskForceNorth.displayDetails();
        charlieSquad.displayDetails();
    }
}
