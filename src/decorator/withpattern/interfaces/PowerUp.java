package decorator.withpattern.interfaces;

public abstract class PowerUp implements Character{

    protected final Character character;

    public PowerUp(Character character) {
        this.character = character;
    }

    @Override
    public int getHealth() {
        return character.getHealth();
    }

    @Override
    public int getDamage() {
        return character.getDamage();
    }

    @Override
    public String getDescription() {
        return character.getDescription();
    }
}
