class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate;

    // Parameterized Constructor
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.dailyRate = 50.0; // Example daily rate
    }

    // Method to calculate the total cost
    double calculateTotalCost() {
        return rentalDays * dailyRate;
    }

    // Method to display rental details
    void displayDetails() {
        System.out.println("Customer: " + customerName + ", Car Model: " + carModel + 
                           ", Rental Days: " + rentalDays + ", Total Cost: $" + calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRental rental = new CarRental("Jane Doe", "Toyota Corolla", 5);

        rental.displayDetails();
    }
}
