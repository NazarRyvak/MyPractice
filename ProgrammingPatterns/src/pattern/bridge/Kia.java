package pattern.bridge;

public class Kia implements Make{

	@Override
	public void makeBy() {
		System.out.println("Kia");
	}

}
