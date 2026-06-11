package strategy.withpattern;

import strategy.withpattern.cars.Car;
import strategy.withpattern.cars.Audi;
import strategy.withpattern.cars.Toyota;
import strategy.withpattern.cars.Swift;
import strategy.withpattern.cars.DynamicCar;
import strategy.withpattern.engine.V2PetrolEngine;
import strategy.withpattern.wheel.OffRoadWheel;
import strategy.withpattern.infotainment.BasicInfotainment;
import strategy.withpattern.suspension.OffRoadSuspension;

public class Main {

    public static void main(String[] args) {

        Car audi = new Audi();
        System.out.println("\n--- Audi ---");
        audi.display();
        audi.drive();

        Car toyota = new Toyota();
        System.out.println("\n--- Toyota ---");
        toyota.display();
        toyota.drive();

        Car swift = new Swift();
        System.out.println("\n--- Swift ---");
        swift.display();
        swift.drive();

        Car custom = new DynamicCar(
            "Off-Road Beast",
            2500000,
            new V2PetrolEngine(),
            new OffRoadWheel(),
            new BasicInfotainment(),
            new OffRoadSuspension()
        );
        System.out.println("\n--- Custom DynamicCar ---");
        custom.display();
        custom.drive();

        System.out.println("\n========================================");
    }
}
