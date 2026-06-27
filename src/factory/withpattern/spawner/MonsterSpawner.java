package factory.withpattern.spawner;

import java.util.Map;

import factory.withpattern.factory.CaveMonsterFactory;
import factory.withpattern.factory.ForestMonsterFactory;
import factory.withpattern.factory.MountainMonsterFactory;
import factory.withpattern.factory.OceanMonsterFactory;
import factory.withpattern.factory.ZoneMonsterFactory;
import factory.withpattern.monster.Monster;
import factory.withpattern.zone.TimeOfDay;
import factory.withpattern.zone.Zone;

public class MonsterSpawner {

    private final Map<Zone, ZoneMonsterFactory> factories = Map.of(
            Zone.FOREST, new ForestMonsterFactory(),
            Zone.OCEAN, new OceanMonsterFactory(),
            Zone.CAVE, new CaveMonsterFactory(),
            Zone.MOUNTAIN, new MountainMonsterFactory());

    public Monster spawn(Zone zone, TimeOfDay timeOfDay) {

        ZoneMonsterFactory factory = factories.get(zone);

        return timeOfDay == TimeOfDay.DAY ? factory.createDayMonster() : factory.createNightMonster();
    }
}
