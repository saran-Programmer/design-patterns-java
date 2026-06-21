package decorator.withpattern.powerup;

import decorator.withpattern.interfaces.Character;
import decorator.withpattern.interfaces.PowerUp;

public class BerserkMode extends PowerUp {

    public BerserkMode(Character character) {
        super(character);
    }

    @Override
    public int getDamage() {
        return super.getDamage() + 50;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + BerserkMode";
    }
}
