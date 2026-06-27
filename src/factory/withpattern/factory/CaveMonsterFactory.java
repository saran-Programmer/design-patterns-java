package factory.withpattern.factory;

import factory.withpattern.monster.BanishedArmySoldiers;
import factory.withpattern.monster.Cavemen;
import factory.withpattern.monster.Monster;

public class CaveMonsterFactory implements ZoneMonsterFactory {

    @Override
    public Monster createDayMonster() {
        return new Cavemen(80, 14, 2, 5);
    }

    @Override
    public Monster createNightMonster() {
        return new BanishedArmySoldiers(100, 22, 3, 6);
    }
}
