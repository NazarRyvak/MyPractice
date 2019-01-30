package pattern.observer;

public class Main {

	public static void main(String[] args) {

		TV tv1 = new TV("TV1");
		Person p = new Person("Vasya");
		Person p2 = new Person("Petro");
		Person p3 = new Person("Kolya");
		Person p4 = new Person("Nazar");
		
		tv1.addObserver(p3);
		tv1.addObserver(p4);
		
		tv1.setAvailable(true);
		tv1.addObserver(p2);
		tv1.setAvailable(false);
		
	}

}
