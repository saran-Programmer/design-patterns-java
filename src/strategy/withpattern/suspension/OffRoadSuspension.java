package strategy.withpattern.suspension;

public class OffRoadSuspension implements SuspensionStrategy {

    private static final int steps = 7;
    private static final String suspensionType = "Off-Road";

    @Override
    public int getSteps() {

        return steps;
    }

    @Override
    public String getSuspensionType() {

        return suspensionType;
    }

    @Override
    public void getSuspensionDetails() {

        System.out.println("Suspension   : " + suspensionType);
        System.out.println("Steps        : " + steps);
    }
}
