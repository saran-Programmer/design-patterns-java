package factory.withpattern.monster;

public class Cavemen extends Monster {

    public Cavemen(int hp, int damage, int speed, int visionRange) {
        super(hp, damage, speed, visionRange);
    }

    @Override
    public String getName() {
        return "Cavemen";
    }
}
