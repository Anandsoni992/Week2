import java.time.LocalDate;

class Order {

	String orderId; 
	LocalDate orderDate; 

	public Order(String orderId, LocalDate orderDate){

		this.orderId = orderId;
		this.orderDate = orderDate; 
	}

	public void getOrderStatus(){
	
		System.out.println( "Order ID: " + orderId+ "\norder Date: "+ orderDate); 
	}
}
class ShippedOrder extends Order{
	int trackingnumber; 

	public ShippedOrder(String orderId, LocalDate orderDate, int trackingnumber){
	
		super(orderId, orderDate); 
		this.trackingnumber= trackingnumber; 
	}

	public void getOrderStatus(){
		super.getOrderStatus(); 
		System.out.println("tracking number: " + trackingnumber); 
	}
}

class DeliveredOrder extends ShippedOrder{
	LocalDate deliveryDate; 

	public DeliveredOrder(String orderId, LocalDate orderDate, int trackingnumber, LocalDate deliveryDate){
		
		super(orderId, orderDate, trackingnumber) ;
		this.deliveryDate = deliveryDate; 
	}
	
	public void getOrderStatus(){
		
		super.getOrderStatus(); 
		System.out.println("Delivery Date: " + deliveryDate) ;
	}
}

class OnlineRetail{
	public static void main(String[] args){

		DeliveredOrder delivery = new DeliveredOrder("123", LocalDate.of(2025, 1, 15), 22525, LocalDate.of(2025, 1, 17)); 
		delivery.getOrderStatus(); 
	}
}