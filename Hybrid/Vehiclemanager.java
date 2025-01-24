class Vehicle {
    private String model;
    private int maxSpeed;

    public Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    public String getmodel() {
        return model;
    }

    public int getmaxSpeed() {
        return maxSpeed;
    }
}
interface Refuelable {
    void refuel();
}

class ElectricVehicle extends Vehicle implements Refuelable {
    public ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }
    public void refuel() {
        System.out.println("ElectricVehicle " + getmodel() + " (maxSpeed: " + getmaxSpeed() + ")");
    }
}
class PetrolVehicle extends Vehicle implements Refuelable {
    public PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }
    public void refuel() {
        System.out.println("PetrolVehicle " + getmodel() + " (maxSpeed: " + getmaxSpeed() + ")");
    }
}
public class Vehiclemanager {
    public static void main(String[] args) {
        ElectricVehicle ElectricVehicle = new ElectricVehicle("pulsor", 101);
        PetrolVehicle PetrolVehicle = new PetrolVehicle("Honda", 202);
        ElectricVehicle.refuel();
        PetrolVehicle.refuel();
    }
}
