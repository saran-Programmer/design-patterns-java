package strategy.withpattern.wheel;

public class OffRoadWheel implements WheelStrategy {

    private static final int wheelRadius = 18;
    private static final String wheelType = "Off-Road";

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
