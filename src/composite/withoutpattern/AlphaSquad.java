package composite.withoutpattern;

public class AlphaSquad {

    private InfantrySoldier infantrySoldier = new InfantrySoldier();
    private Sniper sniper = new Sniper();
    private Medic medic = new Medic();

    public void attack() {
        infantrySoldier.attack();
        sniper.attack();
        medic.attack();
    }

    public void move() {
        infantrySoldier.move();
        sniper.move();
        medic.move();
    }

    public void displayDetails() {
        System.out.println("Alpha Squad");
        infantrySoldier.displayDetails();
        sniper.displayDetails();
        medic.displayDetails();
    }
}
