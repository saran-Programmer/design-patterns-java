package composite.withoutpattern;

public class General {

    public void commandMainBattalion(MainBattalion mainBattalion) {
        System.out.println("General commands the Main Battalion.");
        mainBattalion.attack();
        mainBattalion.move();
    }

    public void commandAlphaSquad(AlphaSquad alphaSquad) {
        System.out.println("General commands Alpha Squad.");
        alphaSquad.attack();
        alphaSquad.move();
    }
}
