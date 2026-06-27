package factory.withpattern;

import factory.withpattern.spawner.MonsterSpawner;
import factory.withpattern.zone.TimeOfDay;
import factory.withpattern.zone.Zone;

public class Main {

    public static void main(String[] args) {

        MonsterSpawner spawner = new MonsterSpawner();

        System.out.println("======================================");
        System.out.println("  Monster Spawner (WITH Factory)");
        System.out.println("======================================\n");

        spawner.spawn(Zone.FOREST, TimeOfDay.DAY).display();
        spawner.spawn(Zone.FOREST, TimeOfDay.NIGHT).display();
        spawner.spawn(Zone.OCEAN, TimeOfDay.DAY).display();
        spawner.spawn(Zone.OCEAN, TimeOfDay.NIGHT).display();
        spawner.spawn(Zone.CAVE, TimeOfDay.DAY).display();
        spawner.spawn(Zone.CAVE, TimeOfDay.NIGHT).display();
        spawner.spawn(Zone.MOUNTAIN, TimeOfDay.DAY).display();
        spawner.spawn(Zone.MOUNTAIN, TimeOfDay.NIGHT).display();
    }
}
