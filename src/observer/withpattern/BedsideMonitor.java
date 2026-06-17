package observer.withpattern;

public class BedsideMonitor implements Observer {

    private static final String NAME = "[Bedside Monitor]";

    @Override
    public void update(int heartRate, int bloodPressure, int bloodSugar) {
        System.out.println(NAME + " Heart Rate: " + heartRate + " bpm | Blood Pressure: " + bloodPressure + " mmHg | Blood Sugar: " + bloodSugar + " mg/dL");
    }
}
