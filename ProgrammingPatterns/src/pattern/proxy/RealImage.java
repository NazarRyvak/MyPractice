package pattern.proxy;

public class RealImage implements Image{

	private String file;
	
	public RealImage(String file) {
		this.file = file;
		load();
	}
	
	public void load() {
		System.out.println("Image load");
	}

	@Override
	public void show() {
		System.out.println(file);
	}
	
}
