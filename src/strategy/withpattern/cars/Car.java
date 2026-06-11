package strategy.withpattern.cars;

import strategy.withpattern.engine.EngineStrategy;
import strategy.withpattern.wheel.WheelStrategy;
import strategy.withpattern.infotainment.InfotainmentStrategy;
import strategy.withpattern.suspension.SuspensionStrategy;

public abstract class Car {

    private EngineStrategy engineStrategy;
    private WheelStrategy wheelStrategy;
    private InfotainmentStrategy infotainmentStrategy;
    private SuspensionStrategy suspensionStrategy;

    public Car(EngineStrategy engineStrategy, WheelStrategy wheelStrategy,
               InfotainmentStrategy infotainmentStrategy, SuspensionStrategy suspensionStrategy) {

        this.engineStrategy = engineStrategy;
        this.wheelStrategy = wheelStrategy;
        this.infotainmentStrategy = infotainmentStrategy;
        this.suspensionStrategy = suspensionStrategy;
    }

    public abstract String getCarName();

    public abstract int getCarPrice();

    public void display() {

        System.out.println("Car Name     : " + getCarName());
        System.out.println("Car Price    : " + getCarPrice());
        engineStrategy.getEngineDetails();
        wheelStrategy.getWheelDetails();
        infotainmentStrategy.getInfotainmentDetails();
        suspensionStrategy.getSuspensionDetails();
    }

    public void drive() {

        System.out.println(getCarName() + " is now driving...");
    }
}
