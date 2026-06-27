package factory.withoutPattern;

public class Monster {

    private final String name;
    private final int hp;
    private final int damage;
    private final int speed;
    private final int visionRange;

    public Monster(String name, int hp, int damage, int speed, int visionRange) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
        this.speed = speed;
        this.visionRange = visionRange;
    }

    public void display() {

        System.out.println("Monster      : " + name);
        System.out.println("HP           : " + hp);
        System.out.println("Damage       : " + damage);
        System.out.println("Speed        : " + speed);
        System.out.println("Vision Range : " + visionRange);
        System.out.println();
    }
}
