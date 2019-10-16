package tester;

import java.util.Scanner;

import pint.*;

public class TestComputable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter number of shapes");
		int limit = sc.nextInt();
		int count = 0;
		Computable cArray[] = new Computable[limit];
		boolean loop = true;
		int option = 0;
		String areaQ = "";
		double x, y, r, w, h;

		while (loop) {

			System.out.println("Please select an option ...\n");
			System.out.println("1. Add Circle");
			System.out.println("2. Add Rectangle");
			System.out.println("3. Display all shapes");
			System.out.println("4. Display all areas and perimeters");
			System.out.println("\n10. EXIT");

			option = sc.nextInt();

			switch (option) {
			case 1:
				// add circles

				if (count < limit) {
					System.out.println("Enter x coordinate: ");
					x = sc.nextDouble();
					System.out.println("Enter y coordinate: ");
					y = sc.nextDouble();
					System.out.println("Enter radius: ");
					r = sc.nextDouble();

					cArray[count++] = new Circle(x, y, r);
				} else
					System.out.println("Limit Exceeded");
				break;
			case 2:
				// add rectangles
				if (count < limit) {
					System.out.println("Enter x coordinate: ");
					x = sc.nextDouble();
					System.out.println("Enter y coordinate: ");
					y = sc.nextDouble();
					System.out.println("Enter width: ");
					w = sc.nextDouble();
					System.out.println("Enter height: ");
					h = sc.nextDouble();

					cArray[count++] = new Rectangle(x, y, w, h);
				} else
					System.out.println("Limit Exceeded");
				break;
			case 3:
				for (Computable c : cArray)
					System.out.println(c);

				break;
			case 4:
				// Display all areas and perimeters for all shapes and invoke drawarc or
				// diagonals depending on object type
				for (Computable c : cArray) {
//					System.out.println("Area is  + " + c.calcArea() + "\nPerimeter is " + c.calcPerimeter() + "\n");

					if (c instanceof Circle) {
						areaQ = "Circle";
						System.out.println("Area of " + areaQ + " is " + c.calcArea() + "\nPerimeter of " + areaQ
								+ " is " + c.calcPerimeter() + "\n");
						((Circle) c).drawArc();
					} else if (c instanceof Rectangle) {
						areaQ = "Rectangle";
						System.out.println("Area of " + areaQ + " is " + c.calcArea() + "\nPerimeter of " + areaQ
								+ " is " + c.calcPerimeter() + "\n");
						((Rectangle) c).diagonals();
					}
//					System.out.println("Area of "+ areaQ +" is  + " + c.calcArea() + "\nPerimeter of "+ areaQ +" is " + c.calcPerimeter() + "\n");
				}
				break;
			case 10:
				sc.close();
				loop = false;
				break;
			default:
				break;
			}
		}

	}

}
