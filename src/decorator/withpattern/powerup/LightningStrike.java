package decorator.withpattern.powerup;

import decorator.withpattern.interfaces.Character;
import decorator.withpattern.interfaces.PowerUp;

public class LightningStrike extends PowerUp {

    public LightningStrike(Character character) {
        super(character);
    }

    @Override
    public int getDamage() {
        return super.getDamage() + 40;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + LightningStrike";
    }
}
