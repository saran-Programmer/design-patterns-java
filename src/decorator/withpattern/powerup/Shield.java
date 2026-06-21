package decorator.withpattern.powerup;

import decorator.withpattern.interfaces.Character;
import decorator.withpattern.interfaces.PowerUp;

public class Shield extends PowerUp {

    public Shield(Character character) {
        super(character);
    }

    @Override
    public int getHealth() {
        return super.getHealth() + 40;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Shield";
    }
}
