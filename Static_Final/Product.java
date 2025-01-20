class Product {
    // Static variable for a shared discount value
    static double discount = 10.0; // Discount in percentage

    // Final variable for a unique product ID
    private final int productID;
    private String productName;
    private double price;
    private int quantity;

    // Constructor to initialize product details using 'this' keyword
    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Static method to update the discount percentage
    static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    // Display product details, checking if the object is an instance of Product
    void displayDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Product Name: " + productName);
            System.out.println("Price: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating Product objects
        Product prod1 = new Product(1, "Laptop", 50000, 2);
        Product prod2 = new Product(2, "Phone", 20000, 1);

        // Display product details
        prod1.displayDetails();
        prod2.displayDetails();

        // Update and display the new discount
        Product.updateDiscount(15.0);
        System.out.println("Updated Discount: " + Product.discount + "%");
    }
}
