package strategy.withoutpattern;

public class OffRoadCar extends Car {

    @Override
    public String getModelName() {

        return "OffRoadCar";
    }

    // Hardcoded: V1 Diesel
    @Override
    public String getEngineName() {

        return "V1 Diesel";
    }

    @Override
    public int getFuelTankCapacity() {

        return 45;
    }

    @Override
    public int getTorque() {

        return 200;
    }

    @Override
    public int getMileage() {

        return 20;
    }

    // Hardcoded: Off-road wheels
    @Override
    public String getWheelType() {

        return "Off-road";
    }

    @Override
    public int getWheelRadius() {

        return 20;
    }

    // Hardcoded: Basic infotainment
    @Override
    public String getInfotainmentSystem() {

        return "Basic";
    }

    // Hardcoded: Off-road suspension
    @Override
    public String getSuspension() {

        return "Off-road";
    }

    @Override
    public double getPrice() {

        return 38000.00;
    }
}
