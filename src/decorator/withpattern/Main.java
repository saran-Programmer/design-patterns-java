package decorator.withpattern;

import decorator.withpattern.character.Archer;
import decorator.withpattern.character.Spearman;
import decorator.withpattern.character.Swordsman;
import decorator.withpattern.powerup.ArmorPlating;
import decorator.withpattern.powerup.CriticalHit;
import decorator.withpattern.powerup.DoubleStrike;
import decorator.withpattern.powerup.Elixir;
import decorator.withpattern.powerup.FireWeapon;
import decorator.withpattern.powerup.PoisonTip;
import decorator.withpattern.powerup.Shield;
import decorator.withpattern.utils.CharacterUtils;
import decorator.withpattern.interfaces.Character;

public class Main {

    private static final CharacterUtils characterUtils = new CharacterUtils();
    
    public static void main(String[] args) {

        Character swordsman = new DoubleStrike(new CriticalHit(new Elixir(new Swordsman())));
        Character archer = new FireWeapon(new Shield(new Archer()));
        Character spearman = new PoisonTip(new ArmorPlating(new Spearman()));

        System.out.println("----------------------------------------------------");
        System.out.println();
        System.out.println(characterUtils.getCharacterDetails(swordsman));
        System.out.println();
        System.out.println("----------------------------------------------------");
        
        System.out.println("----------------------------------------------------");
        System.out.println();
        System.out.println(characterUtils.getCharacterDetails(archer));
        System.out.println();
        System.out.println("----------------------------------------------------");

        System.out.println("----------------------------------------------------");
        System.out.println();
        System.out.println(characterUtils.getCharacterDetails(spearman));
        System.out.println();
        System.out.println("----------------------------------------------------");

        characterUtils.battle(swordsman, spearman);
    }
}
