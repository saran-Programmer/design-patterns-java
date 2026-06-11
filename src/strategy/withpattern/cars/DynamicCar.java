package strategy.withpattern.cars;

import strategy.withpattern.engine.EngineStrategy;
import strategy.withpattern.wheel.WheelStrategy;
import strategy.withpattern.infotainment.InfotainmentStrategy;
import strategy.withpattern.suspension.SuspensionStrategy;

public class DynamicCar extends Car {

    private String carName;
    private int carPrice;

    public DynamicCar(String carName, int carPrice, EngineStrategy engineStrategy,
                      WheelStrategy wheelStrategy, InfotainmentStrategy infotainmentStrategy,
                      SuspensionStrategy suspensionStrategy) {

        super(engineStrategy, wheelStrategy, infotainmentStrategy, suspensionStrategy);
        this.carName = carName;
        this.carPrice = carPrice;
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
