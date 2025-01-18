class Product {
    String productName;
    double price;
    static int totalProducts = 0; // Class variable

    // Constructor
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++; // Increment total products whenever a product is created
    }

    // Instance method
    void displayProductDetails() {
        System.out.println("Product Name: " + productName + ", Price: $" + price);
    }

    // Class method
    static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 1200.0);
        Product p2 = new Product("Smartphone", 800.0);

        p1.displayProductDetails();
        p2.displayProductDetails();
        Product.displayTotalProducts();
    }
}
