package pattern.bridge;

public class Hatchback extends Car{

	public Hatchback(Make make) {
		super(make);
	}

	@Override
	public void showDetails() {
		System.out.println("HatchBack");
		make.makeBy();
	}

}
