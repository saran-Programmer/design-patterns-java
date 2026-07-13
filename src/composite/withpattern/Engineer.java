package composite.withpattern;

public class Engineer implements MilitaryComponent {

    public void attack() {
        System.out.println("Engineer defends the position.");
    }

    public void move() {
        System.out.println("Engineer moves with engineering equipment.");
    }

    public void displayDetails() {
        System.out.println("Engineer");
    }
}
