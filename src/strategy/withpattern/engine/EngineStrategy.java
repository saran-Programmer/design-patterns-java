package strategy.withpattern.engine;

public interface EngineStrategy {

    public int getTorque();

    public int getFuelTankCapacity();

    public int getMileage();

    public String getEngineName();

    public void getEngineDetails();
}
