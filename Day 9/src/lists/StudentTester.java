package lists;

import static utils.ValidationRules.*;
import static utils.CollectionUtils.*;
import java.util.ArrayList;
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
				System.out.println("3. Search PRN in ArrayList");
				System.out.println("4. Populate ArrayList");
				System.out.println("5. Show all students for a course");
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
						String date = sc.nextLine();

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
						System.out.println("Enter the PRN: ");
						String userPRN = sc.next();
						Integer index = students.indexOf(new Student(userPRN));
						if (index == -1)
							throw new StudentHandlingException("\nError: Student not found\n");
						System.out.println(students.get(index));
						break;
					case 4:
						students = populateStudents(students);
						break;
					case 5:
						// take course as input and find object in ArrayList
						System.out.println("Enter Course Name: ");
						Course course = validateCourse(sc.next());
						for (Student s : students) {
							if (s.getCourse().equals(course.toString()))
								System.out.println(s);
						}
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
