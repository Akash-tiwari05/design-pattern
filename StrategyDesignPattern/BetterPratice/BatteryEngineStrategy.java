package BetterPratice;

public class BatteryEngineStrategy implements EngineStrategy {
    @Override
    public String getEngineType() {
        return "Battery Engine";
    }

    @Override
    public String getFuel() {
        return "100%";
    }   
}
