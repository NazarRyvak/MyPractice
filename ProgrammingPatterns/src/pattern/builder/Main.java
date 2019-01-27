package pattern.builder;

public class Main {

	public static void main(String[] args) {

		Car car = new CarBuilder()
				.buildMake("AUDI")
				.buildMaxSpeed(300)
				.buildCountryMake("Germany")
				.build();
		System.out.println(car);
		
	}

}
