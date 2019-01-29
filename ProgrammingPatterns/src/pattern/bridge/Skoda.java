package pattern.bridge;

public class Skoda implements Make {

	@Override
	public void makeBy() {
		System.out.println("Skoda");
	}

}
