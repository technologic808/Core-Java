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
                                Course.DMC));
                students.add(new Student("PRN003", "Micheal", "micheal@cdacacts.com", "80", validateDate("11.11.1999"),
                                Course.DAI));
                students.add(new Student("PRN004", "Jan", "jan@cdacacts.com", "60", validateDate("11.11.1999"),
                                Course.DBDA));
                students.add(new Student("PRN005", "Darryl", "darryl@cdacacts.com", "70", validateDate("11.11.1990"),
                                Course.DITISS));
                return students;
        }
}