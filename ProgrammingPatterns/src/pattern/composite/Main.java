package pattern.composite;

public class Main {

	public static void main(String[] args) {

		Shape square = new Square();
		Shape triangle = new Triangle();
		Shape circle = new Circle();

		
		Components components1 = new Components();
		Components components2 = new Components();
		Components components3 = new Components();
		
		components1.add(square);
		components1.add(triangle);
		components1.add(circle);
		
		components2.add(square);
		components2.add(circle);
		components2.add(circle);
		components2.add(circle);
		components2.add(circle);
		components2.add(circle);
		components2.add(circle);
		
		components3.add(components1);
		components3.add(components2);
		
		components3.draw();
		
	}

}
