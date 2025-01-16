// Importing Scanner class from util package 
import java.util.Scanner; 

// creating class Employee 
class Employee{
// SPecifying privae data members 
	private String name; 
	private String id; 
	private int salary; 
// Creating constructor with parameters
	public Employee(String name, String id, int salary){
	this.name = name; 
	this.id = id; 
	this.salary = salary; 
	}
	public void displaydetails(){
	System.out.print("Employee name is : "+ name + "\nid : " + id + "\nand salary is :" + salary); 
	}
}
public class EmployeeDetails{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in); 
		System.out.print("enter name :" ); 
		String name = input.nextLine(); 
		System.out.print("enter id :" ); 
		String id = input.nextLine(); 
		System.out.print("enter salary :" ); 
		int salary = input.nextInt(); 

		Employee emp = new Employee(name,id,salary); 

		emp.displaydetails(); 

		input.close(); 
	}
}