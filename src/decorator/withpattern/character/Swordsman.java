package decorator.withpattern.character;

import decorator.withpattern.interfaces.Character;

public class Swordsman implements Character {

    @Override
    public String getDescription() {
        return "Swordsman";
    }

    @Override
    public int getHealth() {
        return 100;
    }

    @Override
    public int getDamage() {
        return 50;
    }
}