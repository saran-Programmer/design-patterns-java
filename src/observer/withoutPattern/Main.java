package observer.withoutPattern;

public class Main {

    public static void main(String[] args) {
        PatientVitalMonitor monitor = new PatientVitalMonitor(75, 100, 110);

        System.out.println("=== Initial vitals (all normal) ===");
        monitor.setHeartRate(75);

        System.out.println("\n=== Heart rate drops to critical low ===");
        monitor.setHeartRate(45);

        System.out.println("\n=== Blood pressure spikes ===");
        monitor.setBloodPressure(150);

        System.out.println("\n=== Blood sugar goes dangerously low ===");
        monitor.setBloodSugar(55);

        System.out.println("\n=== All vitals return to normal ===");
        monitor.setHeartRate(80);
        monitor.setBloodPressure(95);
        monitor.setBloodSugar(100);
    }
}
