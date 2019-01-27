package pattern.singleton;

public class Main {

	public static void main(String[] args) {
	
		TestSingleton instance = TestSingleton.getInstance();
		TestSingleton instance1 = TestSingleton.getInstance();
		instance.print();
		instance1.print();

	}

}
