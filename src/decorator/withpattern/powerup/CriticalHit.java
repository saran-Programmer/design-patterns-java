package decorator.withpattern.powerup;

import decorator.withpattern.interfaces.Character;
import decorator.withpattern.interfaces.PowerUp;

public class CriticalHit extends PowerUp {

    public CriticalHit(Character character) {
        super(character);
    }

    @Override
    public int getDamage() {
        return super.getDamage() + 35;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + CriticalHit";
    }
}
