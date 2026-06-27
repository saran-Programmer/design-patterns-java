package factory.withpattern.monster;

public class BanishedArmySoldiers extends Monster {

    public BanishedArmySoldiers(int hp, int damage, int speed, int visionRange) {
        super(hp, damage, speed, visionRange);
    }

    @Override
    public String getName() {
        return "Banished Army Soldiers";
    }
}
