package observer.withpattern;

public class DoctorPager implements Observer {

    private static final String NAME = "[Doctor Pager]";

    @Override
    public void update(int heartRate, int bloodPressure, int bloodSugar) {
        boolean abnormal = heartRate < 60 || heartRate > 100
                || bloodPressure < 80 || bloodPressure > 120
                || bloodSugar < 70 || bloodSugar > 140;

        if (abnormal) {
            System.out.println(NAME + " CRITICAL ALERT — Immediate attention required: HR=" + heartRate + " bpm, BP=" + bloodPressure + " mmHg, BS=" + bloodSugar + " mg/dL");
        }
    }
}
