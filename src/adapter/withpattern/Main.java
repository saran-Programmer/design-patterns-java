package adapter.withpattern;

import adapter.withpattern.adapters.BirdAdapter;
import adapter.withpattern.animals.Elephant;
import adapter.withpattern.animals.Giraffe;
import adapter.withpattern.animals.Lion;
import adapter.withpattern.animals.Zebra;
import adapter.withpattern.birds.Eagle;
import adapter.withpattern.birds.Owl;
import adapter.withpattern.birds.Parrot;
import adapter.withpattern.birds.Sparrow;
import adapter.withpattern.interfaces.Animal;
import adapter.withpattern.manager.SanctuaryManager;

public class Main {

    public static void main(String[] args) {
        SanctuaryManager sanctuaryManager = new SanctuaryManager();

        Animal[] animals = {
                new Lion(),
                new Elephant(),
                new Zebra(),
                new Giraffe(),
                new BirdAdapter(new Eagle()),
                new BirdAdapter(new Parrot()),
                new BirdAdapter(new Owl()),
                new BirdAdapter(new Sparrow())
        };

        System.out.println("Wildlife Sanctuary Management System With Adapter Pattern");
        System.out.println();

        for (int i = 0; i < animals.length; i++) {
            sanctuaryManager.produceSound(animals[i]);
            sanctuaryManager.feed(animals[i]);
            sanctuaryManager.move(animals[i]);
            System.out.println();
        }
    }
}
