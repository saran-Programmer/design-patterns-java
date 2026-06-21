package decorator.withpattern.powerup;

import decorator.withpattern.interfaces.Character;
import decorator.withpattern.interfaces.PowerUp;

public class ArmorPlating extends PowerUp {

    public ArmorPlating(Character character) {
        super(character);
    }

    @Override
    public int getHealth() {
        return super.getHealth() + 70;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + ArmorPlating";
    }
}
