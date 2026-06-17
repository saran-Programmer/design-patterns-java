package observer.withoutPattern;

public class DoctorPager {

    public void checkVitals(int heartRate, int bloodPressure, int bloodSugar) {
        if (heartRate < 60 || heartRate > 100) {
            System.out.println("[Doctor Pager] CRITICAL: Heart Rate out of range — " + heartRate + " bpm. Immediate attention required!");
        }
        if (bloodPressure < 80 || bloodPressure > 120) {
            System.out.println("[Doctor Pager] CRITICAL: Blood Pressure out of range — " + bloodPressure + " mmHg. Immediate attention required!");
        }
        if (bloodSugar < 70 || bloodSugar > 140) {
            System.out.println("[Doctor Pager] CRITICAL: Blood Sugar out of range — " + bloodSugar + " mg/dL. Immediate attention required!");
        }
    }
}
