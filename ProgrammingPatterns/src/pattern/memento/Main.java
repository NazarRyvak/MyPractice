package pattern.memento;

public class Main {

	public static void main(String[] args) {
		Originator originator = new Originator();
		Caretaker caretaker = new Caretaker();

		originator.setState("1");
		System.out.println("State is " + originator.getState());
		caretaker.setMemento(originator.saveState());

		originator.setState("2");
		System.out.println("State is " + originator.getState());

		originator.restoreState(caretaker.getMemento());
		System.out.println("State is " + originator.getState());
	}

}
