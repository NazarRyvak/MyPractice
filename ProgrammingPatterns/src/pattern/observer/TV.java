package pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class TV implements Commodity {

	public static List<Observable> observers = new ArrayList<>();
	private String name;
	private boolean isAvailable = false;
	
	
	
	public TV(String name) {
		this.name = name;
	}


	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
		if (isAvailable) {
			sendMessage("available");
		}
		if (!isAvailable) {
			sendMessage("not available");
		}
	}


	@Override
	public String toString() {
		return "TV [name=" + name + "]";
	}


	@Override
	public void sendMessage(String message) {
		for (Observable observer : observers) {
			observer.update(this + "is "+message+"!!!");
		}
	}

	@Override
	public void addObserver(Observable o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observable o) {
		int index = observers.indexOf(o);
		if (index==-1) {
			return;
		}
		observers.remove(index);
	}

}
