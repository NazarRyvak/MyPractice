package pattern.flyweight;

public class Main {

	public static void main(String[] args) {
		Shape shape1 = ShapeFactory.getShape(2);
		Shape shape2 = ShapeFactory.getShape(2);
		Shape shape3 = ShapeFactory.getShape(2);
		Shape shape4 = ShapeFactory.getShape(3);
		System.out.println(shape1);
		System.out.println(shape2);
		System.out.println(shape3);
		System.out.println(shape4);
		shape1.draw(0, 2);
		shape2.draw(2, 2);
		shape3.draw(1, 2);
		shape4.draw(2, 1);
	}

}
