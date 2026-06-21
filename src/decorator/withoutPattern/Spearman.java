package decorator.withoutPattern;

public class Spearman extends Character {

    @Override
    public String getBaseDescription() {
        return "Spearman";
    }

    @Override
    public int getBaseHp() {
        return 120;
    }

    @Override
    public int getBaseDamage() {
        return 40;
    }
}
