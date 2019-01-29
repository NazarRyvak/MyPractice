package pattern.decorator;

public abstract class Decorator implements Component{

	protected Component component;
	
	public Decorator(Component component) {
		this.component = component;
	}
	
	public abstract void decoratorDraw();
	
	@Override
	public void draw() {
		component.draw();
		decoratorDraw();
	}
}
