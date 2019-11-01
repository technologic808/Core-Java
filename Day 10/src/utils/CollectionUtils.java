package utils;

import java.util.HashMap;

import static utils.ValidationRules.*;
import com.app.core.Course;
import com.app.core.Student;

import cust_excs.StudentHandlingException;

public class CollectionUtils {
        public static HashMap<String, Student> populateStudents(HashMap<String, Student> students)
                        throws StudentHandlingException {
                students.put("PRN001", new Student("PRN001", "Jim", "jim@cdacacts.com", "75",
                                validateDate("11.11.1990"), Course.DAC));
                students.put("PRN002", new Student("PRN002", "Pam", "pam@cdacacts.com", "50",
                                validateDate("11.11.1986"), Course.DAC));
                students.put("PRN003", new Student("PRN003", "Micheal", "micheal@cdacacts.com", "80",
                                validateDate("11.11.1999"), Course.DMC));
                students.put("PRN004", new Student("PRN004", "Jan", "jan@cdacacts.com", "60",
                                validateDate("11.11.1999"), Course.DMC));
                students.put("PRN005", new Student("PRN005", "Darryl", "darryl@cdacacts.com", "70",
                                validateDate("11.11.1990"), Course.DAI));
                return students;
        }

        public static void menu() {
                System.out.println("____________MENU__________\n");
                System.out.println("1. Add Student to Map");
                System.out.println("2. Display all Students in Map");
                System.out.println("3. Search Student in Map by PRN");
                System.out.println("4. Populate Map for testing purposes");
                System.out.println("5. Filter Map by Course");
                System.out.println("6. Update student marks in Map by PRN");
                System.out.println("7. Filter Map by Course and Date of Birth");
                System.out.println("8. Delete Student by PRN from Map");
                System.out.println("\n0. EXIT");
                System.out.println("\nPlease select an option ...\n");
        }
}