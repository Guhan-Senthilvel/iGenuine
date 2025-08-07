abstract class Vehicle {
    private String vehicleType;

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
    abstract void start();

}
class Car extends Vehicle{
    private String carName;
    private String transmission;
    private int yearofMfg;
    public String getCarName() {
        return carName;
    }
    public void setCarName(String carName) {
        this.carName = carName;
    }
    public String getTransmission() {
        return transmission;
    }
    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }
    public int getYearofMfg() {
        return yearofMfg;
    }
    public void setYearofMfg(int yearofMfg) {
        this.yearofMfg = yearofMfg;
    }
    void start(){
        System.out.println("Using key");
    }
    
}
class Owner extends Car{
    private String name;
    private int ownerNo;
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getOwnerNo() {
        return ownerNo;
    }
    public void setOwnerNo(int ownerNo) {
        this.ownerNo = ownerNo;
    }
    void display(){
        setName("Guhan");
        setOwnerNo(1);
        System.out.println(getName());
        System.out.println(getOwnerNo());
    }

    void start(){
        System.out.println("Search for key");
    }
}
    // void displayOwner(){
    //     System.out.println("Vehicle Type : "+vehicleType);
    //     System.out.println("Owner Name : "+name);
    //     System.out.println("No of Owner : "+ownerNo);
    //     System.out.println("Car Name : "+carName);
    //     System.out.println("Transmission : "+transmission);
    //     System.out.println("Year of Mfg : "+yearofMfg);
    // }

class Details{
    public static void main(String[] args) {
        Owner obj=new Owner();
        obj.setVehicleType("Car");
        System.out.println(obj.getVehicleType());
        obj.display();
        obj.start();
    }
}

base class abstract item - title,authors
class book - genre(+) ,constructor(title,author,genre usig super) display
class borrowed book - borrower name +,dueDare+; constructor(every thing initialize) display