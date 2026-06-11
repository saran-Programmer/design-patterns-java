package strategy.withpattern.wheel;

public class SteelWheel implements WheelStrategy {

    private static final int wheelRadius = 15;
    private static final String wheelType = "Steel";

    @Override
    public int getWheelRadius() {

        return wheelRadius;
    }

    @Override
    public String getWheelType() {

        return wheelType;
    }

    @Override
    public void getWheelDetails() {

        System.out.println("Wheel Type   : " + wheelType);
        System.out.println("Wheel Radius : " + wheelRadius + " inches");
    }
}
