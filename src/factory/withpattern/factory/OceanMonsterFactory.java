package factory.withpattern.factory;

import factory.withpattern.monster.Leviathan;
import factory.withpattern.monster.Monster;
import factory.withpattern.monster.Pirates;

public class OceanMonsterFactory implements ZoneMonsterFactory {

    @Override
    public Monster createDayMonster() {
        return new Pirates(70, 15, 4, 7);
    }

    @Override
    public Monster createNightMonster() {
        return new Leviathan(200, 40, 2, 10);
    }
}
