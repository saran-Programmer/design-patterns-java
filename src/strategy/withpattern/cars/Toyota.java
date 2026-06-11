package strategy.withpattern.cars;

import strategy.withpattern.engine.V1DieselEngine;
import strategy.withpattern.wheel.AlloyWheel;
import strategy.withpattern.infotainment.BasicInfotainment;
import strategy.withpattern.suspension.StandardSuspension;

public class Toyota extends Car {

    private static final String carName = "Toyota";
    private static final int carPrice = 1500000;

    public Toyota() {

        super(new V1DieselEngine(), new AlloyWheel(), new BasicInfotainment(), new StandardSuspension());
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
