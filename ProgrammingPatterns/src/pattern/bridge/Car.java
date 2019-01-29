package pattern.bridge;

public abstract class Car {

	protected Make make;
	
	public Car(Make make) {
		this.make = make;
	}
	
	public abstract void showDetails();
}
