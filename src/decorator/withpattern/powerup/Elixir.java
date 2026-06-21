package decorator.withpattern.powerup;

import decorator.withpattern.interfaces.Character;
import decorator.withpattern.interfaces.PowerUp;

public class Elixir extends PowerUp {

    public Elixir(Character character) {
        super(character);
    }

    @Override
    public int getHealth() {
        return super.getHealth() + 50;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Elixir";
    }
}
