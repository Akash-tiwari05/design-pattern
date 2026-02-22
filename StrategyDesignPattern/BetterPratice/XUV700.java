package BetterPratice;

public class XUV700 extends Car {
    private EngineStrategy engineStrategy;

    public XUV700(PetrolEngineStrategy engineStrategy) {
        this.engineStrategy = engineStrategy;
    }


    public String getEngineType() {
        return engineStrategy.getEngineType();
    }
    

    public String getInfo() {
        return "XUV700 with " + engineStrategy.getEngineType() 
        + " and fuel capacity of " + engineStrategy.getFuel();
    }
}
