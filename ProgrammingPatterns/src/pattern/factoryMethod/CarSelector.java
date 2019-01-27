package pattern.factoryMethod;

public abstract class CarSelector {
	
	public static Car getCar(RoadType roadType) {
		Car car = null;
		switch (roadType) {
		case CITY:
			car = new Porsche();
			break;
		case OFF_ROAD:
			car = new Jeep();
			break;
		}
		return car;
	}
	
	public abstract Car getCar();
}
