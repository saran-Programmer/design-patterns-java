package factory.withpattern.monster;

public class Bandits extends Monster {

    public Bandits(int hp, int damage, int speed, int visionRange) {
        super(hp, damage, speed, visionRange);
    }

    @Override
    public String getName() {
        return "Bandits";
    }
}
