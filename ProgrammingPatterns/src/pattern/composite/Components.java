package pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Components implements Shape{
	
	private List<Shape> list = new ArrayList<>();
	
	public void add(Shape shape) {
		list.add(shape);
	}
	
	public void remove(Shape shape) {
		list.remove(shape);
	}
	@Override
	public void draw() {
		for (Shape shape : list) {
			shape.draw();
		}
	}

}
