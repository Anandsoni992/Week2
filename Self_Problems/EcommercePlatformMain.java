import java.util.ArrayList;

// Product class
class Product {
    private String name;
    private double price;

    // Constructor to initialize product details
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Method to display product details
    @Override
    public String toString() {
        return "Product Name: " + name + ", Price: $" + price;
    }

    // Get product price
    public double getPrice() {
        return price;
    }
}

// Order class
class Order {
    private int orderId;
    private Customer customer;
    private ArrayList<Product> products;

    // Constructor to initialize order details
    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    // Method to add a product to the order
    public void addProduct(Product product) {
        products.add(product);
    }

    // Method to calculate the total price of the order
    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    // Display order details
    public void displayOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer: " + customer.getName());
        System.out.println("Products in the Order:");
        for (Product product : products) {
            System.out.println("  " + product);
        }
        System.out.println("Total Price: $" + calculateTotal());
    }
}

// Customer class
class Customer {
    private String name;
    private ArrayList<Order> orders;

    // Constructor to initialize customer details
    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    // Method to place an order
    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed Order ID: " + order.orderId);
    }

    // Display all orders of the customer
    public void displayOrders() {
        System.out.println("Customer: " + name);
        System.out.println("Orders:");
        for (Order order : orders) {
            order.displayOrderDetails();
        }
    }

    // Get customer name
    public String getName() {
        return name;
    }
}

// Main class
public class EcommercePlatformMain{
    public static void main(String[] args) {
        // Creating customers objects
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        // Creating products
        Product product1 = new Product("Laptop", 999.99);
        Product product2 = new Product("Phone", 699.99);
        Product product3 = new Product("Headphones", 199.99);
        Product product4 = new Product("Keyboard", 49.99);

        // Creating orders for Alice
        Order order1 = new Order(101, customer1);
        order1.addProduct(product1); // Laptop
        order1.addProduct(product3); // Headphones

        Order order2 = new Order(102, customer1);
        order2.addProduct(product4); // Keyboard

        // Creating orders for Bob
        Order order3 = new Order(201, customer2);
        order3.addProduct(product2); // Phone
        order3.addProduct(product3); // Headphones

        // Customers place their orders
        customer1.placeOrder(order1);
        customer1.placeOrder(order2);

        customer2.placeOrder(order3);

        // Displaying Alice's orders
        customer1.displayOrders();

        // Displaying Bob's orders
        customer2.displayOrders();
    }
}
