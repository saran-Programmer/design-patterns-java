package decorator.withpattern.powerup;

import decorator.withpattern.interfaces.Character;
import decorator.withpattern.interfaces.PowerUp;

public class PoisonTip extends PowerUp {

    public PoisonTip(Character character) {
        super(character);
    }

    @Override
    public int getDamage() {
        return super.getDamage() + 20;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + PoisonTip";
    }
}
