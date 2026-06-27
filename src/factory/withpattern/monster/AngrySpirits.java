package factory.withpattern.monster;

public class AngrySpirits extends Monster {

    public AngrySpirits(int hp, int damage, int speed, int visionRange) {
        super(hp, damage, speed, visionRange);
    }

    @Override
    public String getName() {
        return "Angry Spirits";
    }
}
