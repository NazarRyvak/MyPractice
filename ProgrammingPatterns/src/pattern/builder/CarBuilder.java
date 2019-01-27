package pattern.builder;

public class CarBuilder {

	private String make;
	
	private String countryMake;
	
	private int maxSpeed;

	public CarBuilder buildMake(String make) {
		this.make = make;
		return this;
	}

	public CarBuilder buildCountryMake(String countryMake) {
		this.countryMake = countryMake;
		return this;
	}

	public CarBuilder buildMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
		return this;
	}
	
	public Car build() {
		Car car =  new Car();
		car.setMake(make);
		car.setMaxSpeed(maxSpeed);
		car.setCountryMake(countryMake);
		return car;
	}
}
