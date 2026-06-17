package observer.withpattern;

public class NurseStationDisplay implements Observer {

    private static final String NAME = "[Nurse Station]";

    @Override
    public void update(int heartRate, int bloodPressure, int bloodSugar) {
        boolean abnormal = heartRate < 60 || heartRate > 100
                || bloodPressure < 80 || bloodPressure > 120
                || bloodSugar < 70 || bloodSugar > 140;

        if (abnormal) {
            System.out.println(NAME + " ALERT — Abnormal vitals detected: HR=" + heartRate + " bpm, BP=" + bloodPressure + " mmHg, BS=" + bloodSugar + " mg/dL");
        }
    }
}
