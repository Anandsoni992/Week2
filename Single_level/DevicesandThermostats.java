class Devices {
	private String deviceID ; 
	private int status; 
	
	public Devices (String deviceID, int status){

		this.deviceID = deviceID; 
		this.status = status; 

	}

	public void displayStatus(){

		System.out.println("Device Id : " + deviceID + "\nStatus: " + status) ;
	}
}

class Thermostat extends Devices {
	String temperatureSetting ; 
	
	public Thermostat(String deviceID, int status, String temperatureSetting){

		super(deviceID,status);
		this.temperatureSetting = temperatureSetting;  
	} 
	public void displayStatus(){

		super.displayStatus(); 
		System.out.println("Thermostat temperature Setting : " + temperatureSetting); 
	}
}

public class DevicesandThermostats{
	public static void main(String[] args){

	Thermostat Thermostat = new Thermostat("121212",1,"Celcius"); 
	Thermostat.displayStatus(); 
	}
}