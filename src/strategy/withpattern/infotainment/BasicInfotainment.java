package strategy.withpattern.infotainment;

public class BasicInfotainment implements InfotainmentStrategy {

    private static final int SPEAKERS = 2;
    private static final String DISPLAY_SIZE = "7\"";
    private static final String TYPE = "Basic";

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
