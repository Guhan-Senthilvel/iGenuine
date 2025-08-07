package Device;

public class Thermostat extends SmartDevice {
    private double temperature;

    Thermostat(String deviceName) {
        super(deviceName);
    }

    public void setTemperature(double temp) {
        this.temperature = temp;
    }

    @Override
    public void performFunction() {
        System.out.println("Thermostat " + getDeviceName() + " is set to " + temperature + " degree C");
    }
}