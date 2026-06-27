package factory.withpattern.factory;

import factory.withpattern.monster.Monster;

public interface ZoneMonsterFactory {

    Monster createDayMonster();

    Monster createNightMonster();
}
