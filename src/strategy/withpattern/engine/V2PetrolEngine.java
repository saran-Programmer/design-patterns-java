package strategy.withpattern.engine;

public class V2PetrolEngine implements EngineStrategy {

    private static final int torque = 200;
    private static final int fuelTankCapacity = 50;
    private static final int mileage = 12;
    private static final String engineName = "V2 Petrol";

    @Override
    public int getTorque() {

        return torque;
    }

    @Override
    public int getFuelTankCapacity() {

        return fuelTankCapacity;
    }

    @Override
    public int getMileage() {

        return mileage;
    }

    @Override
    public void getEngineDetails() {

        System.out.println("Engine Type  : " + engineName);
        System.out.println("Torque       : " + torque + " Nm");
        System.out.println("Fuel Tank    : " + fuelTankCapacity + " litres");
        System.out.println("Mileage      : " + mileage + " km/l");
    }

    @Override
    public String getEngineName() {

        return engineName;
    }
}
