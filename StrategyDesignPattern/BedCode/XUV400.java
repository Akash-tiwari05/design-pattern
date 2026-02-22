package BedCode;
public class XUV400 extends Car implements BatteryEngine, PetrolEngine{

    @Override
    public String getBattery() {
        return "Battery Engine";
    }

    @Override
    public String getPetrol() {
        return "Petrol Engine";
    }       
    
}
