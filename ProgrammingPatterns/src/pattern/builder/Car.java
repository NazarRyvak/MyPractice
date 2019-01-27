package pattern.builder;

public class Car {

	private String make;
	
	private int maxSpeed;
	
	private String countryMake;

	public void setMake(String make) {
		this.make = make;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public void setCountryMake(String countryMake) {
		this.countryMake = countryMake;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", maxSpeed=" + maxSpeed + ", countryMake=" + countryMake + "]";
	}
}
