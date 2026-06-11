package strategy.withpattern.suspension;

public class StandardSuspension implements SuspensionStrategy {

    private static final int steps = 3;
    private static final String suspensionType = "Standard";

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
