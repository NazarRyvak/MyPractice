package pattern.factoryMethod;

public class SelectPorsche extends CarSelector{

	@Override
	public Car getCar() {
		return new Porsche();
	}

}
