package composite.withpattern;

public class InfantrySoldier implements MilitaryComponent {

    public void attack() {
        System.out.println("Infantry Soldier attacks with a rifle.");
    }

    public void move() {
        System.out.println("Infantry Soldier advances on foot.");
    }

    public void displayDetails() {
        System.out.println("Infantry Soldier");
    }
}
