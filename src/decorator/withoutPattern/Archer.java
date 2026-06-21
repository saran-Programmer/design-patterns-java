package decorator.withoutPattern;

public class Archer extends Character {

    @Override
    public String getBaseDescription() {
        return "Archer";
    }

    @Override
    public int getBaseHp() {
        return 80;
    }

    @Override
    public int getBaseDamage() {
        return 60;
    }
}
