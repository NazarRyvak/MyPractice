package pattern.prototype;

public class Human implements Copyable {

	private String name;
	private int age;
	
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	protected Human(Human human) {
		this.name = human.name;
		this.age = human.age;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + "]";
	}

	@Override
	public Object clone() {
		return new Human(this);
	}

}
