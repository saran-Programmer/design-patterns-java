package strategy.withpattern.cars;

import strategy.withpattern.engine.V1PetrolEngine;
import strategy.withpattern.wheel.SteelWheel;
import strategy.withpattern.infotainment.NoInfotainment;
import strategy.withpattern.suspension.StandardSuspension;

public class Swift extends Car {

    private static final String carName = "Swift";
    private static final int carPrice = 600000;

    public Swift() {

        super(new V1PetrolEngine(), new SteelWheel(), new NoInfotainment(), new StandardSuspension());
    }

    @Override
    public String getCarName() {

        return carName;
    }

    @Override
    public int getCarPrice() {

        return carPrice;
    }
}
