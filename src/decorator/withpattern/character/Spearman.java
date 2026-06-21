package decorator.withpattern.character;

import decorator.withpattern.interfaces.Character;

public class Spearman implements Character {
    
    @Override
    public String getDescription() {
        return "Spearman";
    }

    @Override
    public int getHealth() {
        return 120;
    }

    @Override
    public int getDamage() {
        return 40;
    }
}
