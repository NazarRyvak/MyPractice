package pattern.proxy;

public class Main {

	public static void main(String[] args) {
		//Image image = new RealImage("D:/images/image.png");
		
		Image image = new ProxyImage("D:/images/image.png");
		image.show();
	}

}
