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
			throw new StudentHandlingException("Name is not valid");
		else
			return name;
	}

	public static String validateEmail(String email) throws StudentHandlingException {
		if ((email.length() < 4 || email.length() > 10) || !email.contains("@"))
			throw new StudentHandlingException("Email is not valid");
		else
			return email;
	}

	public static Course validateCourse(String course) throws StudentHandlingException {
		try {
			return Course.valueOf(course.toUpperCase());
		} catch (IllegalArgumentException e) {
			throw new StudentHandlingException("Course not valid");
		}
	}

	public static Date validateDate(Date date) throws StudentHandlingException {
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
			Date threshold = sdf.parse("01.01.1985");
			if (threshold.compareTo(date) > 0)
				throw new StudentHandlingException("DOB need to greater than 01.01.1985");
			else
				return date;
		} catch (ParseException e) {
			throw new StudentHandlingException("Not a valid date");
		}

	}

	public static String validatePRN(ArrayList<Student> students, String prn) throws StudentHandlingException {
		if (students.contains(new Student(prn)))
			throw new StudentHandlingException("Duplicate Student");
		return prn;
	}

}
