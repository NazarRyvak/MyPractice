package pattern.flyweight;

public class Circle implements Shape{

	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public void draw(int x, int y) {
		System.out.println("Draw circle (" + x + ";" + y + ") with radius " + radius);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(radius);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (Double.doubleToLongBits(radius) != Double.doubleToLongBits(other.radius))
			return false;
		return true;
	}
	
	

}
