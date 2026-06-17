package observer.withoutPattern;

public class BedsideMonitor {

    public void display(int heartRate, int bloodPressure, int bloodSugar) {
        System.out.println("[Bedside Monitor] Vitals Update:");
        System.out.println("  Heart Rate    : " + heartRate + " bpm");
        System.out.println("  Blood Pressure: " + bloodPressure + " mmHg");
        System.out.println("  Blood Sugar   : " + bloodSugar + " mg/dL");
    }
}
