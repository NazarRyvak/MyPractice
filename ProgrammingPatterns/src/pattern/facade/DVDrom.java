package pattern.facade;

public class DVDrom {
	
	private boolean data = false;
	
	public boolean hasData() {
		return data;
	}
	
	public void load() {
		data = true;
	}
	
	public void unload() {
		data = false;
	}
}
