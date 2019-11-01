package utils;

import java.util.ArrayList;
import static utils.ValidationRules.*;
import com.app.core.Course;
import com.app.core.Student;

import cust_excs.StudentHandlingException;

public class CollectionUtils {
        public static ArrayList<Student> populateStudents(ArrayList<Student> students) throws StudentHandlingException {
                students.add(new Student("PRN001", "Jim", "jim@cdacacts.com", "75", validateDate("11.11.1990"),
                                Course.DAC));
                students.add(new Student("PRN002", "Pam", "pam@cdacacts.com", "50", validateDate("11.11.1986"),
                                Course.DAC));
                students.add(new Student("PRN003", "Micheal", "micheal@cdacacts.com", "80", validateDate("11.11.1999"),
                                Course.DMC));
                students.add(new Student("PRN004", "Jan", "jan@cdacacts.com", "60", validateDate("11.11.1999"),
                                Course.DMC));
                students.add(new Student("PRN005", "Darryl", "darryl@cdacacts.com", "70", validateDate("11.11.1990"),
                                Course.DAI));
                return students;
        }

        public static void menu() {
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
                System.out.println("11. Display topper student name");
                System.out.println("\n0. EXIT");
                System.out.println("\nPlease select an option ...\n");
        }
}