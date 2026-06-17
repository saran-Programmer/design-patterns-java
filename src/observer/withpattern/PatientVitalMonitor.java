package observer.withpattern;

import java.util.ArrayList;
import java.util.List;

public class PatientVitalMonitor implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private int heartRate = 75;
    private int bloodPressure = 110;
    private int bloodSugar = 100;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(heartRate, bloodPressure, bloodSugar);
        }
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
        notifyObservers();
    }

    public void setBloodPressure(int bloodPressure) {
        this.bloodPressure = bloodPressure;
        notifyObservers();
    }

    public void setBloodSugar(int bloodSugar) {
        this.bloodSugar = bloodSugar;
        notifyObservers();
    }
}
