package pattern.prototype;

public class Main {

	public static void main(String[] args) {
		Human original = new Human("Nazar", 22);
		System.out.println(original);
		Human copy = (Human)original.clone();
		System.out.println(copy);

	}

}
