package decorator.withpattern.powerup;

import decorator.withpattern.interfaces.Character;
import decorator.withpattern.interfaces.PowerUp;

public class SharpBlade extends PowerUp {

    public SharpBlade(Character character) {
        super(character);
    }

    @Override
    public int getDamage() {
        return super.getDamage() + 15;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + SharpBlade";
    }
}
