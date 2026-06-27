package factory.withpattern.monster;

public class FrostGiants extends Monster {

    public FrostGiants(int hp, int damage, int speed, int visionRange) {
        super(hp, damage, speed, visionRange);
    }

    @Override
    public String getName() {
        return "Frost Giants";
    }
}
