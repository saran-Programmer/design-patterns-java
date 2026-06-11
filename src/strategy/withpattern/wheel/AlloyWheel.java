package strategy.withpattern.wheel;

public class AlloyWheel implements WheelStrategy {

    private static final int wheelRadius = 17;
    private static final String wheelType = "Alloy";

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
