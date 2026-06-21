package decorator.withpattern.utils;

import decorator.withpattern.interfaces.Character;

public class CharacterUtils {

    public String getCharacterDetails(Character character) {

        return character.getDescription()
                + " | HP: " + character.getHealth()
                + " | Damage: " + character.getDamage();
    }

    private int hitsToDefeat(Character target, Character attacker) {

        return (target.getHealth() + attacker.getDamage() - 1) / attacker.getDamage();
    }

    public void battle(Character c1, Character c2) {

        int hitsForC1ToWin = hitsToDefeat(c2, c1);
        int hitsForC2ToWin = hitsToDefeat(c1, c2);

        System.out.println("Fighter 1: " + getCharacterDetails(c1));
        System.out.println("Fighter 2: " + getCharacterDetails(c2));
        System.out.println(c1.getDescription() + " needs " + hitsForC1ToWin + " hits to defeat " + c2.getDescription());
        System.out.println(c2.getDescription() + " needs " + hitsForC2ToWin + " hits to defeat " + c1.getDescription());

        if (hitsForC1ToWin < hitsForC2ToWin) {
            System.out.println("Winner: " + c1.getDescription());
        } else if (hitsForC2ToWin < hitsForC1ToWin) {
            System.out.println("Winner: " + c2.getDescription());
        } else {
            System.out.println("Result: Both characters died");
        }
    }
}
