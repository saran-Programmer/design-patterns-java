package decorator.withpattern.powerup;

import decorator.withpattern.interfaces.Character;
import decorator.withpattern.interfaces.PowerUp;

public class DoubleStrike extends PowerUp {

    public DoubleStrike(Character character) {
        super(character);
    }

    @Override
    public int getDamage() {
        return super.getDamage() * 2;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + DoubleStrike";
    }
}
