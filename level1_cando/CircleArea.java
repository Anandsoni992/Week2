// Importing Scanner class from util package 
import java.util.Scanner; 

// creating class to calculate area of circle
class AreaofCircle{
// SPecifying privae data members 
	private double radius; 
// Creating constructor with required parameters
	public AreaofCircle(double radius){
	this.radius = radius; 
	}
	public void displayarea(){
	System.out.print("area of the circle is : "+ 3.14*radius*radius); 
	}
}
public class CircleArea{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in); 
		System.out.print("enter radius :" ); 
		double radius = input.nextDouble(); 

		AreaofCircle area = new AreaofCircle(radius); 

		area.displayarea(); 

		input.close(); 
	}
}