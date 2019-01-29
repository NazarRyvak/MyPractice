package pattern.decorator;

public class BorderDecorator extends Decorator{

	public BorderDecorator(Component component) {
		super(component);
	}

	@Override
	public void decoratorDraw() {
		System.out.println("... add  border");
	}

}
