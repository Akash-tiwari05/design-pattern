package BedCode;
public class XUV300 extends Car implements BatteryEngine{


    //this is bad practice because we are tightly coupling the XUV300 
    // class with the BatteryEngine interface.
   // becuse here repetition of code is there in XUV300 and XUV400 class 
   // which is not good practice.
    @Override
    public String getBattery() {
        return "Battery Engine";
    }
    
}
