package observer.withoutPattern;

public class NurseStationDisplay {

    public void checkVitals(int heartRate, int bloodPressure, int bloodSugar) {
        if (heartRate < 60 || heartRate > 100) {
            System.out.println("[Nurse Station] ALERT: Heart Rate is abnormal — " + heartRate + " bpm");
        }
        if (bloodPressure < 80 || bloodPressure > 120) {
            System.out.println("[Nurse Station] ALERT: Blood Pressure is abnormal — " + bloodPressure + " mmHg");
        }
        if (bloodSugar < 70 || bloodSugar > 140) {
            System.out.println("[Nurse Station] ALERT: Blood Sugar is abnormal — " + bloodSugar + " mg/dL");
        }
    }
}
