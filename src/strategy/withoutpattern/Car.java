package strategy.withoutpattern;

public abstract class Car {

    public abstract String getModelName();

    public abstract String getEngineName();
    public abstract int getFuelTankCapacity();
    public abstract int getTorque();
    public abstract int getMileage();

    public abstract String getWheelType();
    public abstract int getWheelRadius();

    public abstract String getInfotainmentSystem();

    public abstract String getSuspension();

    public abstract double getPrice();

    public void drive() {

        System.out.println("--- " + getModelName() + " is driving ---");
        System.out.println("Engine  : " + getEngineName() + " roaring at " + getTorque() + " Nm torque");
        System.out.println("Wheels  : " + getWheelType() + " (" + getWheelRadius() + " inch) gripping the road");
        System.out.println("Suspension: " + getSuspension() + " absorbing the bumps");
        System.out.println("Vroom! Vroom!\n");
    }

    public void display() {

        System.out.println("========================================");
        System.out.println("  Model          : " + getModelName());
        System.out.println("========================================");
        System.out.println("  Engine         : " + getEngineName());
        System.out.println("  Fuel Tank      : " + getFuelTankCapacity() + " litres");
        System.out.println("  Torque         : " + getTorque() + " Nm");
        System.out.println("  Mileage        : " + getMileage() + " kmpl");
        System.out.println("  Wheel Type     : " + getWheelType());
        System.out.println("  Wheel Radius   : " + getWheelRadius() + " inches");
        System.out.println("  Infotainment   : " + getInfotainmentSystem());
        System.out.println("  Suspension     : " + getSuspension());
        System.out.println("  Price          : $" + String.format("%.2f", getPrice()));
        System.out.println("========================================\n");
    }
}
