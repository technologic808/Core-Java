package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.app.core.Course;
import com.app.core.Student;

import cust_excs.StudentHandlingException;

public class ValidationRules {
	public static String validateName(String name) throws StudentHandlingException {
		if (name.length() < 4 || name.length() > 10)
			throw new StudentHandlingException("\nError: Name is not valid\n");
		else
			return name;
	}

	public static String validateEmail(String email) throws StudentHandlingException {
		if ((email.length() < 4 || email.length() > 25) || !email.contains("@"))
			throw new StudentHandlingException("\nError: Email is not valid\n");
		else
			return email;
	}

	public static Course validateCourse(String course) throws StudentHandlingException {
		try {
			return Course.valueOf(course.toUpperCase());
		} catch (IllegalArgumentException e) {
			throw new StudentHandlingException("\nError: Course not valid\n");
		}
	}

	public static Date validateDate(String dateString) throws StudentHandlingException {
		try {
			Date date = new SimpleDateFormat("dd.MM.yyyy").parse(dateString);
			SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
			Date threshold = sdf.parse("01.01.1985");
			if (threshold.compareTo(date) > 0)
				throw new StudentHandlingException("\nError: DOB need to greater than 01.01.1985\n");
			else
				return date;
		} catch (ParseException e) {
			throw new StudentHandlingException("\nError: Not a valid date\n");
		}
	}

	public static boolean validateDateOfBirth(String cutOffDateString, Date studentDob)
			throws StudentHandlingException {
		return validateDate(cutOffDateString).before(studentDob);

	}

	public static String validatePRN(ArrayList<Student> students, String prn) throws StudentHandlingException {
		if (students.contains(new Student(prn)))
			throw new StudentHandlingException("\nError: PRN already exists\n");
		return prn;
	}

	public static String reverseValidatePRN(ArrayList<Student> students, String prn) throws StudentHandlingException {
		if (!students.contains(new Student(prn)))
			throw new StudentHandlingException("\nError: PRN does not exist\n");
		return prn;
	}

}
