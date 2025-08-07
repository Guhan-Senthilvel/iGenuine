package Device;
public class Room {
    String roomName;
    SmartDevice device1;
    SmartDevice device2;

    Room(String roomName, SmartDevice device1,SmartDevice device2) {
        this.roomName=roomName;
        this.device1=device1;
        this.device2=device2;
    }

    void showRoomDevices(){
        System.out.println("Room: " + roomName);
        System.out.println("Device: " + device1.getDeviceName());
        System.out.println("Device: " + device2.getDeviceName());
    }

    void controlDevices(){
        device1.performFunction();
        device2.performFunction();
    }

}
