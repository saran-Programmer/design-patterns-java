package observer.withoutPattern;

public class PatientVitalMonitor {

    private int heartRate;
    private int bloodPressure;
    private int bloodSugar;

    // Hard-coded references to every device — adding a new device means editing this class
    private BedsideMonitor bedsideMonitor;
    private NurseStationDisplay nurseStationDisplay;
    private DoctorPager doctorPager;

    public PatientVitalMonitor(int heartRate, int bloodPressure, int bloodSugar) {
        this.heartRate = heartRate;
        this.bloodPressure = bloodPressure;
        this.bloodSugar = bloodSugar;

        this.bedsideMonitor = new BedsideMonitor();
        this.nurseStationDisplay = new NurseStationDisplay();
        this.doctorPager = new DoctorPager();
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
        notifyAllDevices();
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
        notifyAllDevices();
    }

    public void setBloodSugar(int bloodSugar) {
        this.bloodSugar = bloodSugar;
        notifyAllDevices();
    }

    // Must be updated manually every time a new device is added
    private void notifyAllDevices() {
        bedsideMonitor.display(heartRate, bloodPressure, bloodSugar);
        nurseStationDisplay.checkVitals(heartRate, bloodPressure, bloodSugar);
        doctorPager.checkVitals(heartRate, bloodPressure, bloodSugar);
    }
}
