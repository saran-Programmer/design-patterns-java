package strategy.withoutpattern;

public class SedanCar extends Car {

    @Override
    public String getModelName() {

        return "SedanCar";
    }

    // Hardcoded: V1 Petrol
    @Override
    public String getEngineName() {

        return "V1 Petrol";
    }

    @Override
    public int getFuelTankCapacity() {

        return 40;
    }

    @Override
    public int getTorque() {

        return 150;
    }

    @Override
    public int getMileage() {

        return 15;
    }

    // Hardcoded: Steel wheels
    @Override
    public String getWheelType() {

        return "Steel";
    }

    @Override
    public int getWheelRadius() {

        return 15;
    }

    // Hardcoded: Basic infotainment
    @Override
    public String getInfotainmentSystem() {

        return "Basic";
    }

    // Hardcoded: Standard suspension
    @Override
    public String getSuspension() {

        return "Standard";
    }

    @Override
    public double getPrice() {

        return 25000.00;
    }
}
