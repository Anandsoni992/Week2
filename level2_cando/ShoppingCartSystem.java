import java.util.ArrayList;

class CartItem {
    String itemName;
    double price;
    int quantity;

    // Constructor to initialize item details
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to calculate total cost for the item
    public double getTotalCost() {
        return price * quantity;
    }
}

class ShoppingCart {
    ArrayList<CartItem> cartItems;

    // Constructor to initialize shopping cart
    public ShoppingCart() {
        cartItems = new ArrayList<>();
    }

    // Method to add an item to the cart
    public void addItem(String itemName, double price, int quantity) {
        cartItems.add(new CartItem(itemName, price, quantity));
        System.out.println(itemName + " added to the cart.");
    }

    // Method to remove an item from the cart
    public void removeItem(String itemName) {
        cartItems.removeIf(item -> item.itemName.equals(itemName));
        System.out.println(itemName + " removed from the cart.");
    }

    // Method to display the total cost of the cart
    public void displayTotalCost() {
        double totalCost = 0;
        for (CartItem item : cartItems) {
            totalCost += item.getTotalCost();
        }
        System.out.println("Total Cost: " + totalCost);
    }
    
    // Method to display cart items
    public void displayItems() {
        if(cartItems.isEmpty()) {
            System.out.println("Cart is empty.");
        } else {
            for (CartItem item : cartItems) {
                System.out.println("Item: " + item.itemName + ", Price: " + item.price + ", Quantity: " + item.quantity);
            }
        }
    }
}

public class ShoppingCartSystem {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Laptop", 50000.0, 1);
        cart.addItem("Headphones", 2000.0, 2);
        cart.displayItems();
        cart.displayTotalCost();
        cart.removeItem("Headphones");
        cart.displayItems();
        cart.displayTotalCost();
    }
}
