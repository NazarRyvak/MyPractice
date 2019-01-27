package pattern.factoryMethod;

public class Main {

	public static void main(String[] args) {

		Car car = CarSelector.getCar(RoadType.CITY);
		car.drive();
		car = CarSelector.getCar(RoadType.OFF_ROAD);
		car.drive();
		
		
		CarSelector carSelector = new SelectPorsche();
		car = carSelector.getCar();
		car.drive();
		carSelector = new SelectJeep();
		car = carSelector.getCar();
		car.drive();
	}

}
