package strategy.withpattern.suspension;

public class SportSuspension implements SuspensionStrategy {

    private static final int steps = 5;
    private static final String suspensionType = "Sport";

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
