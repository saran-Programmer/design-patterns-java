package decorator.withpattern.powerup;

import decorator.withpattern.interfaces.Character;
import decorator.withpattern.interfaces.PowerUp;

public class FireWeapon extends PowerUp {

    public FireWeapon(Character character) {
        super(character);
    }

    @Override
    public int getDamage() {
        return super.getDamage() + 30;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + FireWeapon";
    }
}
