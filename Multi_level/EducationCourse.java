class Course {

	String courseName; 
	int duration; 

	public Course(String courseName, int duration){

		this.courseName = courseName;
		this.duration = duration; 
	}

	public void getCourseStatus(){
	
		System.out.println( "Course Name: " + courseName+ "\nCourse Duration: "+ duration+ " years"); 
	}
}
class OnlineCourse extends Course{
	String platform;
	String isRecorded;  

	public OnlineCourse(String courseName, int duration, String platform, String isRecorded){
		super(courseName, duration); 
		this.platform= platform;
		this.isRecorded= isRecorded;  
	}

	public void getCourseStatus(){
		super.getCourseStatus(); 
		System.out.println("Platform: " + platform);
		System.out.println("Recorded lectures Available: " + isRecorded); 
	}
}

class PaidOnlineCourse extends OnlineCourse{
	int fee;
	int discount;  

	public PaidOnlineCourse(String courseName,int duration, String platform, String isRecorded, int fee, int discount){
		
		super(courseName, duration, platform, isRecorded) ;
		this.fee = fee;
		this.discount = discount;  
	}
	
	public void getCourseStatus(){
		
		super.getCourseStatus(); 
		System.out.println("Fees: " + fee) ;
		System.out.println("Discount: "+ discount); 
	}
}

class EducationCourse{
	public static void main(String[] args){

		PaidOnlineCourse delivery = new PaidOnlineCourse("Engineering",4, "Eklavya", "Yes", 400000, 50000); 
		delivery.getCourseStatus(); 
	}
}