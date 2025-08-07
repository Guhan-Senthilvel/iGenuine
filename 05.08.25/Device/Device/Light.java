package Device;
public class Light extends SmartDevice {
    private int brightnessLevel;
    void setBrightness(int level){
        brightnessLevel=level;
    }
    
    Light(String deviceName) {
        super(deviceName);
    }

    @Override
    void performFunction() {
        System.out.println("Light " + getDeviceName() + " is adjusting brightness to " + brightnessLevel + " %");
    }
    
}
