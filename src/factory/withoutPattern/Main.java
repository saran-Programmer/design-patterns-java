package factory.withoutPattern;

public class Main {

    public static void main(String[] args) {

        MonsterSpawner spawner = new MonsterSpawner();

        System.out.println("======================================");
        System.out.println("  Monster Spawner (WITHOUT Factory)");
        System.out.println("======================================\n");

        spawner.spawnMonster("Forest", "Day").display();
        spawner.spawnMonster("Forest", "Night").display();
        spawner.spawnMonster("Ocean", "Day").display();
        spawner.spawnMonster("Ocean", "Night").display();
        spawner.spawnMonster("Cave", "Day").display();
        spawner.spawnMonster("Cave", "Night").display();
        spawner.spawnMonster("Mountain", "Day").display();
        spawner.spawnMonster("Mountain", "Night").display();
    }
}
