package BetterPratice;

public class XUV300 extends Car {
    private EngineStrategy engineStrategy;

    //this is better practice because we are using composition to 
    // inject the engine strategy into the XUV300 class.
    public XUV300(BatteryEngineStrategy engineStrategy) {
        this.engineStrategy = engineStrategy;
    }

    public String getEngineType() {
        return engineStrategy.getEngineType();
    }
}
