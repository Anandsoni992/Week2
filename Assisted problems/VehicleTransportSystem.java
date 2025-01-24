class Vehicle {
    private int maxSpeed;
    private String fuelType;

    public Vehicle(String fuelType, int maxSpeed) {
        this.fuelType = fuelType;
        this.maxSpeed = maxSpeed;
    }

    public void displayInfo() {
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("MAX Speed: " + maxSpeed);
    }
}

class Car extends Vehicle {
    private int seatCapacity;

    public Car(String fuelType, int maxSpeed, int seatCapacity) {
        super(fuelType, maxSpeed);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}

class Truck extends Vehicle {
    private int wheels;

    public Truck(String fuelType, int maxSpeed, int wheels) {
        super(fuelType, maxSpeed);
        this.wheels = wheels;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Wheels : " + wheels);
    }
}

class Motorcycle extends Vehicle {
    private String EngineType;

    public Motorcycle(String fuelType, int maxSpeed, String EngineType) {
        super(fuelType,maxSpeed);
        this.EngineType = EngineType;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Engine Type : " + EngineType);
    }
}

public class VehicleTransportSystem {
    public static void main(String[] args) {
        Car car = new Car("Petrol", 150,5);
        Truck truck = new Truck("Desiel", 200, 8);
        Motorcycle motor = new Motorcycle("Petrol", 100, "120CC");

        System.out.println("Car Details:");
        car.displayInfo();

        System.out.println("\nTruck Details:");
        truck.displayInfo();

        System.out.println("\nMotor Cycle Details:");
        motor.displayInfo();
    }
}
