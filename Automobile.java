
public class Automobile {
	private String manufacturer = "";
	
	public void setManufacturer(String whoMadeit){
		this.manufacturer = whoMadeit;
	}
	public String getManufacturer() {
		return manufacturer;
	}
}

class SUV extends Automobile{
	
	
	SUV(String manufacturer){
		setManufacturer(manufacturer);
	}
}
class SportsCar extends Automobile{
	
	
	SportsCar(String manufacturer){
		setManufacturer(manufacturer);
	}
	
}
