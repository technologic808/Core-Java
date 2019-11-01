package lists;

import static utils.ValidationRules.*;
import static utils.CollectionUtils.*;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import com.app.core.*;

public class StudentTester {

	static final Comparator<Student> MARKS_COMPARATOR = new Comparator<Student>() {
		@Override
		public int compare(Student o1, Student o2) {
			return o1.getMarks().compareTo(o2.getMarks());
		}
	};

	public static void main(String[] args) {
		HashMap<String, Student> students = new HashMap<>();
		Set<String> studentsSet = students.keySet();

		Student tempStudent = null;
		Integer option = 0;
		String prn, date, name, email, courseString, marks;
		Boolean loop = true;

		try (Scanner sc = new Scanner(System.in);) {

			while (loop) {
				menu(); // Show Menu
				option = sc.nextInt();
				try {
					switch (option) {
					case 1:
						// Register new Student
						sc.nextLine();
						System.out.println("Enter Student PRN: ");
						prn = sc.nextLine();

						System.out.println("Enter Student Name: ");
						name = sc.nextLine();

						System.out.println("Enter Email: ");
						email = sc.nextLine();

						System.out.println("Enter Course: ");
						courseString = sc.nextLine();

						System.out.println("Enter Date (dd.mm.yyyy): ");
						date = sc.nextLine();

						System.out.println("Enter Marks: ");
						marks = sc.nextLine();

						tempStudent = new Student(validatePRN(students, prn), validateName(name), validateEmail(email),
								marks, validateDate(date), validateCourse(courseString));

						students.put(prn, tempStudent);

						break;

					case 2:
						// Display all students
						for (String p : studentsSet) {
							System.out.println(students.get(p));
						}
						break;
					case 3:
						// Search by PRN
						System.out.println("Enter PRN: ");
						System.out.println(students.get(reverseValidatePRN(students, sc.next())));
						break;
					case 4:
						// Populate List for testing purposes
						students = populateStudents(students);
						break;
					case 5:
						// Filter List by Course
						System.out.println("Enter Course Name: ");
						Course course = validateCourse(sc.next());
						for (String p : studentsSet) {
							if (students.get(p).getCourse().toString().equals(course.toString()))
								System.out.println(students.get(p));
						}
						break;
					case 6:
						// Update student marks in List by PRN
						System.out.println("Enter PRN: ");
						prn = reverseValidatePRN(students, sc.next());
						System.out.println("Enter new marks: ");
						students.get(prn).setMarks(sc.next());
						System.out.println("\nMarks updated successfully for PRN: " + prn + "\n");
						break;
					case 7:
						// Filter List by Course and Date of Birth
						// take course and dob as input from user
						System.out.println("Please enter Course Name: ");
						course = validateCourse(sc.next());
						System.out.println("Please enter cut-off Birth Date (dd.mm.yyyy)");
						String cutOffDate = sc.next();
						for (String p : studentsSet) {
							if (course == students.get(p).getCourse()
									&& validateDateOfBirth(cutOffDate, students.get(p).getDob()))
								System.out.println(students.get(p));
						}
						break;
					case 8:
						// Delete Student by PRN from List
						// take PRN as input and delete from list
						System.out.println("Please input PRN: ");
						prn = reverseValidatePRN(students, sc.next());
						if (students.remove(prn, students.get(prn)))
							System.out.println("Admission cancelled successfully!");
						break;
					case 0:
						sc.close();
						loop = false;
						break;
					default:
						System.out.println("\nPlease enter a valid option\n");
						break;
					}
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}
}
