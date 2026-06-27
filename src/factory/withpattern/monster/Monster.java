package factory.withpattern.monster;

public abstract class Monster {

    private final int hp;
    private final int damage;
    private final int speed;
    private final int visionRange;

    protected Monster(int hp, int damage, int speed, int visionRange) {
        this.hp = hp;
        this.damage = damage;
        this.speed = speed;
        this.visionRange = visionRange;
    }

    public abstract String getName();

    public int getHp() {
        return hp;
    }

    public int getDamage() {
        return damage;
    }

    public int getSpeed() {
        return speed;
    }

    public int getVisionRange() {
        return visionRange;
    }

    public void display() {

        System.out.println("Monster      : " + getName());
        System.out.println("HP           : " + hp);
        System.out.println("Damage       : " + damage);
        System.out.println("Speed        : " + speed);
        System.out.println("Vision Range : " + visionRange);
        System.out.println();
    }
}
