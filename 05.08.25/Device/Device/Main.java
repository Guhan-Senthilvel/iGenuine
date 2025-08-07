package Device;
public class Main {
    public static void main(String[] args) {
        Light l1 = new Light("Living Room Light");
        l1.setBrightness(75);
        Thermostat t1 = new Thermostat("Living Room Thermostat");
        t1.setTemperature(22.5);
        Light l2 = new Light("Bedroom Light");
        l2.setBrightness(60);
        Thermostat t2 = new Thermostat("Bedroom Thermostat");
        t2.setTemperature(25.0);
        Room r1 = new Room("Living Room", l1, t1);
        Room r2 = new Room("Bedroom", l2, t2);
        House house = new House(r1, r2);
        house.showAllDevices();
        house.controlAllDevices();
    }
}
