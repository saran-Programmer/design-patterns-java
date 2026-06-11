package strategy.withpattern.cars;

import strategy.withpattern.engine.V2DieselEngine;
import strategy.withpattern.wheel.AlloyWheel;
import strategy.withpattern.infotainment.PremiumInfotainment;
import strategy.withpattern.suspension.SportSuspension;

public class Audi extends Car {

    private static final String carName = "Audi";
    private static final int carPrice = 5000000;

    public Audi() {

        super(new V2DieselEngine(), new AlloyWheel(), new PremiumInfotainment(), new SportSuspension());
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
