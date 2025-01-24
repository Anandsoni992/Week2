class Book {
	private String title ; 
	private int publicationYear; 
	
	public Book (String title, int publicationYear){

		this.title = title; 
		this.publicationYear = publicationYear; 

	}

	public void displayInfo(){

		System.out.println("Titile : " + title + "\nPublication Year: " + publicationYear) ;
	}
}

class Author extends Book {
	String name ; 
	String bio ; 
	
	public Author(String title, int publicationYear, String name, String bio){

		super(title,publicationYear);
		this.name = name;  
		this.bio = bio ; 
	} 
	public void displayInfo(){

		super.displayInfo(); 
		System.out.println("Author Name : " + name); 
		System.out.println("Bio : " + bio); 
	}
}

public class BookandAuthors{
	public static void main(String[] args){

	Author author = new Author("I am the only one", 2026, "Anand", "Engineer, Author, Mimicry artist and Dancer"); 
	author.displayInfo(); 
	}
}