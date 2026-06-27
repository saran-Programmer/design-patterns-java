package factory.withpattern.monster;

public class Pirates extends Monster {

    public Pirates(int hp, int damage, int speed, int visionRange) {
        super(hp, damage, speed, visionRange);
    }

    @Override
    public String getName() {
        return "Pirates";
    }
}
