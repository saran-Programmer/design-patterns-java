package adapter.withoutPattern;

import adapter.withoutPattern.animals.Elephant;
import adapter.withoutPattern.animals.Giraffe;
import adapter.withoutPattern.animals.Lion;
import adapter.withoutPattern.animals.Zebra;
import adapter.withoutPattern.birds.Eagle;
import adapter.withoutPattern.birds.Owl;
import adapter.withoutPattern.birds.Parrot;
import adapter.withoutPattern.birds.Sparrow;
import adapter.withoutPattern.manager.SanctuaryManager;

public class Main {

    public static void main(String[] args) {
        SanctuaryManager sanctuaryManager = new SanctuaryManager();

        Object[] livingBeings = {
                new Lion(),
                new Elephant(),
                new Zebra(),
                new Giraffe(),
                new Eagle(),
                new Parrot(),
                new Owl(),
                new Sparrow()
        };

        System.out.println("Wildlife Sanctuary Management System Without Adapter Pattern");
        System.out.println();

        for (int i = 0; i < livingBeings.length; i++) {
            sanctuaryManager.produceSound(livingBeings[i]);
            sanctuaryManager.feed(livingBeings[i]);
            sanctuaryManager.move(livingBeings[i]);
            System.out.println();
        }
    }
}
