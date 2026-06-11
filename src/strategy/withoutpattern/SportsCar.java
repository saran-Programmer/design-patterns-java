package strategy.withoutpattern;

public class SportsCar extends Car {

    @Override
    public String getModelName() {

        return "SportsCar";
    }

    // Hardcoded: V2 Petrol
    @Override
    public String getEngineName() {

        return "V2 Petrol";
    }

    @Override
    public int getFuelTankCapacity() {

        return 60;
    }

    @Override
    public int getTorque() {

        return 250;
    }

    @Override
    public int getMileage() {

        return 12;
    }

    // Hardcoded: Alloy wheels
    @Override
    public String getWheelType() {

        return "Alloy";
    }

    @Override
    public int getWheelRadius() {

        return 18;
    }

    // Hardcoded: Premium infotainment
    @Override
    public String getInfotainmentSystem() {

        return "Premium";
    }

    // Hardcoded: Sport suspension
    @Override
    public String getSuspension() {

        return "Sport";
    }

    @Override
    public double getPrice() {

        return 45000.00;
    }
}
