package decorator.withpattern.character;

import decorator.withpattern.interfaces.Character;

public class Archer implements Character {

    @Override
    public String getDescription() {
        return "Archer";
    }

    @Override
    public int getHealth() {
        return 80;
    }

    @Override
    public int getDamage() {
        return 60;
    }
}
