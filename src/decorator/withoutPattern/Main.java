package decorator.withoutPattern;

public class Main {

    public static void main(String[] args) {

        System.out.println("======================================");
        System.out.println("  Power-Up System (WITHOUT Decorator)");
        System.out.println("======================================\n");

        Character swordsman = new Swordsman();
        swordsman.setHasFireWeapon(true);
        swordsman.setHasShield(true);

        Character archer = new Archer();
        archer.setHasPoisonTip(true);
        archer.setHasDoubleStrike(true);

        Character spearman = new Spearman();
        spearman.setHasShield(true);

        swordsman.display();
        archer.display();
        spearman.display();

        System.out.println("======================================");
        System.out.println("               Battles");
        System.out.println("======================================\n");

        Character.fight(swordsman, archer);
        Character.fight(archer, spearman);
        Character.fight(swordsman, spearman);
    }
}
