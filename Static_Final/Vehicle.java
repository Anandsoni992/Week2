class Vehicle {
    // Static variable shared across all vehicles for registration fee
    static double registrationFee = 1500.0;

    // Final variable for a unique registration number
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    // Constructor to initialize vehicle details using 'this' keyword
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Static method to update the registration fee
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Display vehicle details, checking if the object is an instance of Vehicle
    void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Registration Fee: " + registrationFee);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating Vehicle objects
        Vehicle vehicle1 = new Vehicle("John", "Car", "AB123");
        Vehicle vehicle2 = new Vehicle("Jane", "Bike", "CD456");

        // Display vehicle details
        vehicle1.displayDetails();
        vehicle2.displayDetails();

        // Update and display the new registration fee
        Vehicle.updateRegistrationFee(2000.0);
        System.out.println("Updated Registration Fee: " + Vehicle.registrationFee);
    }
}
