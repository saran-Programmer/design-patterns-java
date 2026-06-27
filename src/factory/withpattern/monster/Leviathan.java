package factory.withpattern.monster;

public class Leviathan extends Monster {

    public Leviathan(int hp, int damage, int speed, int visionRange) {
        super(hp, damage, speed, visionRange);
    }

    @Override
    public String getName() {
        return "Leviathan";
    }
}
