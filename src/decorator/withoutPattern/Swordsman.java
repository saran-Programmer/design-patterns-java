package decorator.withoutPattern;

public class Swordsman extends Character {

    @Override
    public String getBaseDescription() {
        return "Swordsman";
    }

    @Override
    public int getBaseHp() {
        return 100;
    }

    @Override
    public int getBaseDamage() {
        return 50;
    }
}
