package pint;
import pint.Computable;
import pint.Point;

public class Rectangle extends Point implements Computable {

	private double width, height;
	public Rectangle(double x, double y, double width, double height) {
		super(x, y);
		this.height = height;
		this.width = width;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcArea() {
		// TODO Auto-generated method stub
		return width * height;
	}

	@Override
	public double calcPerimeter() {
		// TODO Auto-generated method stub
		return 2 * (height + width);
	}
	
	public void diagonals()
	{
	 System.out.println("diagonals of rectangle are equal in lenth");
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\nHeight: " + height +  "\nWidth: " + width + "\n";
	}


}
