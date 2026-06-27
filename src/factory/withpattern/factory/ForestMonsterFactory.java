package factory.withpattern.factory;

import factory.withpattern.monster.AngrySpirits;
import factory.withpattern.monster.Bandits;
import factory.withpattern.monster.Monster;

public class ForestMonsterFactory implements ZoneMonsterFactory {

    @Override
    public Monster createDayMonster() {
        return new Bandits(60, 12, 3, 6);
    }

    @Override
    public Monster createNightMonster() {
        return new AngrySpirits(40, 18, 5, 8);
    }
}
