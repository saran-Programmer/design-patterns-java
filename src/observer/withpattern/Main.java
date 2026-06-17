package observer.withpattern;

public class Main {

    public static void main(String[] args) {
        PatientVitalMonitor monitor = new PatientVitalMonitor();

        BedsideMonitor bedside = new BedsideMonitor();
        NurseStationDisplay nurseStation = new NurseStationDisplay();
        DoctorPager doctorPager = new DoctorPager();

        monitor.registerObserver(bedside);
        monitor.registerObserver(nurseStation);
        monitor.registerObserver(doctorPager);

        System.out.println("--- Normal heart rate update (75 → 82 bpm) ---");
        monitor.setHeartRate(82);

        System.out.println("\n--- Elevated heart rate (critical) ---");
        monitor.setHeartRate(115);

        System.out.println("\n--- Heart rate back to normal ---");
        monitor.setHeartRate(78);

        System.out.println("\n--- High blood pressure (critical) ---");
        monitor.setBloodPressure(145);

        System.out.println("\n--- Blood pressure back to normal ---");
        monitor.setBloodPressure(95);

        System.out.println("\n--- Low blood sugar (critical) ---");
        monitor.setBloodSugar(45);

        System.out.println("\n--- Blood sugar back to normal ---");
        monitor.setBloodSugar(105);
    }
}
