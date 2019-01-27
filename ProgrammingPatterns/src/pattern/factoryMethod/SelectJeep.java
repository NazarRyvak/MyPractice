package pattern.factoryMethod;

public class SelectJeep extends CarSelector {

	@Override
	public Car getCar() {
		return new Jeep();
	}

	

}
