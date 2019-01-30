package pattern.observer;

public interface Commodity {

	public void sendMessage(String message);
	
	public void addObserver(Observable o);
	
	public void removeObserver(Observable o);
	
}
