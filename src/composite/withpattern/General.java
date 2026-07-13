package composite.withpattern;

public class General {

    public void commandAttack(MilitaryComponent component) {
        System.out.println("General issues an attack command.");
        component.attack();
    }

    public void commandMove(MilitaryComponent component) {
        System.out.println("General issues a move command.");
        component.move();
    }

    public void requestDetails(MilitaryComponent component) {
        System.out.println("General requests formation details.");
        component.displayDetails();
    }
}
