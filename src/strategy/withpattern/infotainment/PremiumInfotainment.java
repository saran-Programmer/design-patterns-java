package strategy.withpattern.infotainment;

public class PremiumInfotainment implements InfotainmentStrategy {

    private static final int SPEAKERS = 6;
    private static final String DISPLAY_SIZE = "12\"";
    private static final String TYPE = "Premium";

    @Override
    public int getSpeakers() {

        return SPEAKERS;
    }

    @Override
    public String getDisplaySize() {

        return DISPLAY_SIZE;
    }

    @Override
    public String getInfotainmentType() {

        return TYPE;
    }

    @Override
    public void getInfotainmentDetails() {

        System.out.println("Infotainment : " + TYPE);
    }
}
