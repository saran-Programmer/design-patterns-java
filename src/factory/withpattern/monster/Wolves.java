package factory.withpattern.monster;

public class Wolves extends Monster {

    public Wolves(int hp, int damage, int speed, int visionRange) {
        super(hp, damage, speed, visionRange);
    }

    @Override
    public String getName() {
        return "Wolves";
    }
}
