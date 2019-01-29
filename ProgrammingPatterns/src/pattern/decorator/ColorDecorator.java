package pattern.decorator;

public class ColorDecorator extends Decorator{

	public ColorDecorator(Component component) {
		super(component);
	}

	@Override
	public void decoratorDraw() {
		System.out.println("... add color");
	}

}
