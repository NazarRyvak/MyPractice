package pattern.decorator;

public class Main {

	public static void main(String[] args) {

		Component textWithBorder = new BorderDecorator(new TextView());
		textWithBorder.draw();
		
		Component textWithBorderAndColor = new BorderDecorator(new ColorDecorator(new TextView()));
		textWithBorderAndColor.draw();
		
	}

}
