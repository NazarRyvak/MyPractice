package pattern.observer;

public class Person implements Observable {

	private String fullName;
	
	public Person(String fullName) {
		this.fullName = fullName;
	}
	@Override
	public String toString() {
		return "Person [fullName=" + fullName + "]";
	}
	@Override
	public void update(String message) {
		System.out.println(this + message);
	}

}
