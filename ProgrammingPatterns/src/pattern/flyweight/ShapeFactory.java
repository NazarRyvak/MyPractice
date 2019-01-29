package pattern.flyweight;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ShapeFactory {
	private static Set<Shape> shapes = new HashSet<>();
	
	public static Shape getShape(double radius) {
		Shape shape = null;
		if (!shapes.contains(new Circle(radius))) {
			shape = new Circle(radius);
			shapes.add(shape);
		}else {
			for (Iterator<Shape> it = shapes.iterator(); it.hasNext(); ) {
		        Shape shapeFromSet = it.next();
		        if (shapeFromSet.equals(new Circle(radius))){
		        	shape = shapeFromSet;
		        }
		            
		    }
		}
		return shape;
	}
	
}
