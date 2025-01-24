class Person {
	int age ; 
	String name ; 
	
	public Person(int age, String name){
	
		this.age = age; 
		this.name = name ; 
	}

	public void displayRole(){
		System.out.println("Age: " + age + "\nname: " + name); 
	}
}
class Teacher extends Person {
	String subject; 
	public Teacher (int age, String name, String subject){
		super(age, name); 
		this.subject = subject; 
	}
	public void displayRole(){
		System.out.println("Teacher:"); 
		super.displayRole();
		System.out.println("Subject: " + subject); 
	}
}
class Student extends Person {
	String grade; 
	public Student(int age, String name, String grade){

		super(age, name) ;
		this.grade = grade; 
	}
	public void displayRole(){ 
		System.out.println("Student:");
		super.displayRole(); 
		System.out.println("Grade: " + grade); 
	}

}
class Staff extends Person {
	String designation; 
	public Staff(int age, String name, String designation){

		super(age, name) ;
		this.designation = designation; 
	}
	public void displayRole(){ 
		System.out.println("Staff:");
		super.displayRole(); 
		System.out.println("Designation: " + designation); 
	}

} 
public class PersonTypes{
	public static void main(String[] args){
		Teacher savings = new Teacher(35,"Anshika","MATHS");
		savings.displayRole(); 
		Student checking = new Student(22,"Anand","A+"); 
		checking.displayRole(); 
		Staff fixed = new Staff(25,"Ankit","clean boy"); 
		fixed.displayRole(); 
	}
}
