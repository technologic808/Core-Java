package lists;

import static utils.ValidationRules.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import com.app.core.*;

import cust_excs.StudentHandlingException;

public class StudentTester {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();

		Student tempStudent = null;
		try (Scanner sc = new Scanner(System.in);) {
			boolean loop = true;
			int option = 0;

			while (loop) {

				System.out.println("____________MENU__________\n");
				System.out.println("1. Register new Student");
				System.out.println("2. Display all Students");
				System.out.println("3. Search PRN in Database");
				System.out.println("\n10. EXIT");
				System.out.println("\nPlease select an option ...\n");

				option = sc.nextInt();
				try {
					switch (option) {
					case 1:

						sc.nextLine();
						System.out.println("Enter Student PRN: ");
						String prn = sc.nextLine();

						System.out.println("Enter Student Name: ");
						String name = sc.nextLine();

						System.out.println("Enter Email: ");
						String email = sc.nextLine();

						System.out.println("Enter Course: ");
						String courseString = sc.nextLine();

						System.out.println("Enter Date (dd.mm.yyyy): ");
						Date date = new SimpleDateFormat("dd.MM.yyyy").parse(sc.nextLine());

						System.out.println("Enter Marks: ");
						String marks = sc.nextLine();

						tempStudent = new Student(validatePRN(students, prn), validateName(name), validateEmail(email),
								marks, validateDate(date), validateCourse(courseString));

						students.add(tempStudent);

						break;

					case 2:
						for (Student s : students) {
							System.out.println(s);
						}
						break;
					case 3:
						System.out.println("Enter PRN to search");
						String searchPRN = sc.next();
						System.out.println("SearchPRN is " + searchPRN);
						Student temp = new Student(searchPRN);
						Integer in = students.indexOf(temp);
						System.out.println("index is " + in);
						if (in != -1)
							System.out.println(students.get(in));
						else
							throw new StudentHandlingException("Student not found");
						break;
					case 10:
						sc.close();
						loop = false;
						break;
					default:
						break;
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

			}

		}
	}
}
