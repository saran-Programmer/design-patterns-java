package factory.withpattern.factory;

import factory.withpattern.monster.FrostGiants;
import factory.withpattern.monster.Monster;
import factory.withpattern.monster.Wolves;

public class MountainMonsterFactory implements ZoneMonsterFactory {

    @Override
    public Monster createDayMonster() {
        return new Wolves(50, 16, 6, 9);
    }

    @Override
    public Monster createNightMonster() {
        return new FrostGiants(250, 35, 2, 8);
    }
}
