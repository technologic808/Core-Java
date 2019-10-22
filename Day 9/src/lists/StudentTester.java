package lists;

import static utils.ValidationRules.*;
import static utils.CollectionUtils.*;
import java.util.ArrayList;
import java.util.Scanner;

import com.app.core.*;

public class StudentTester {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<>();

		Student tempStudent = null;
		Integer option = 0;
		String userPRN;
		Boolean loop = true;

		try (Scanner sc = new Scanner(System.in);) {

			while (loop) {

				System.out.println("____________MENU__________\n");
				System.out.println("1. Add Student to List");
				System.out.println("2. Display all Students in List");
				System.out.println("3. Search Student in List by PRN");
				System.out.println("4. Populate List for testing purposes");
				System.out.println("5. Filter List by Course");
				System.out.println("6. Update student marks in List by PRN");
				System.out.println("7. Filter List by Course and Date of Birth");
				System.out.println("8. Delete Student by PRN from List");
				System.out.println("9. Sort n display students in List by PRN (Natural Ordering)");
				System.out.println("10. Sort n display students in List by DOB and Marks (Custom Ordering)");
				System.out.println("\n0. EXIT");
				System.out.println("\nPlease select an option ...\n");

				option = sc.nextInt();
				try {
					switch (option) {
					case 1:
						// Register new Student
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
						// Display all students
						for (Student s : students) {
							System.out.println(s);
						}
						break;
					case 3:
						// Search by PRN
						System.out.println("Enter PRN: ");
						System.out.println(
								students.get(students.indexOf(new Student(reverseValidatePRN(students, sc.next())))));
						break;
					case 4:
						students = populateStudents(students);
						break;
					case 5:
						System.out.println("Enter Course Name: ");
						Course course = validateCourse(sc.next());
						for (Student s : students) {
							if (s.getCourse().equals(course.toString()))
								System.out.println(s);
						}
						break;
					case 6:
						System.out.println("Enter PRN: ");
						userPRN = reverseValidatePRN(students, sc.next());
						System.out.println("Enter new marks: ");
						students.get(students.indexOf(new Student(userPRN))).setMarks(sc.next());
						System.out.println("\nMarks updated successfully for PRN: " + userPRN + "\n");
						break;
					case 7:
						break;
					case 8:
						break;
					case 9:
						break;
					case 10:
						break;
					case 0:
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
