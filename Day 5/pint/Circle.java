package pint;

public class Circle extends Point implements Computable {

	private double radius;

	public Circle(double x, double y, double radius) {
		super(x, y);
		this.radius = radius;

		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcArea() {
		// TODO Auto-generated method stub

		return PI * radius * radius;
	}

	@Override
	public double calcPerimeter() {

		// TODO Auto-generated method stub

		return 2 * PI * radius;
	}

	public void drawArc() {
		System.out.println("drawing arc");
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\nRadius: " + radius + "\n";
	}

}
