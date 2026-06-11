package strategy.withpattern.infotainment;

public class NoInfotainment implements InfotainmentStrategy {

    private static final int SPEAKERS = 0;
    private static final String DISPLAY_SIZE = "None";
    private static final String TYPE = "None";

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

        System.out.println("Infotainment : None");
    }
}
