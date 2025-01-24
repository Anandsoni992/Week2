class Animal {
	String name ; 
	int age ; 
	public Animal(String name, int age){
	this.name = name ; 
	this.age = age; 
}
	public void makeSound(){

	System.out.println(" "); 

	}
	public void displayDetails (){
	System.out.println("Name : " + name) ; 
	System.out.println("Age : " + age); 
}

}

class Dog extends Animal{
	
	public Dog(String name, int age){

	super(name,age); 
}
	
	public void makeSound(){
	System.out.println("Dog makes bark sound");  
	super.displayDetails(); 	

	}
}

class Cat extends Animal{

	public Cat(String name, int age){

	super(name,age); 
}

	public void makeSound(){
	System.out.println("Cat makes Meow sound"); 	
	super.displayDetails(); 
	}
}

class Bird extends Animal{ 

	public Bird(String name, int age){

	super(name,age); 
}

	public void makeSound(){ 
	System.out.println("Birds makes chirupping sound"); 	
	super.displayDetails(); 
	}
} 

public class Sounds{
	public static void main(String[] args){
	Animal animal = new Animal("Anand",22) ; 
	animal.makeSound(); 
	Dog dog = new Dog("Ankit", 25); 
	dog.makeSound(); 
	Cat cat = new Cat("Aakrati", 22); 
	cat.makeSound(); 
	Bird bird = new Bird("Anshika", 22); 
	bird.makeSound();

	}
}
