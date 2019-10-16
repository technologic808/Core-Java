package utils;

import cust_excs.StudentHandlingException;

public class ValidationRules {
	public static void validateName(String name) throws StudentHandlingException {
		if (name.length() < 4 || name.length() > 10)
			throw new StudentHandlingException("Name is not valid");
	}

	public static void validateEmail(String email) throws StudentHandlingException {
		if ((email.length() < 4 || email.length() > 10) || !email.contains("@"))
			throw new StudentHandlingException("Email is not valid");
	}

	public static void validateCourse(String course) throws StudentHandlingException {
		if (!course.equals("dac") && !course.equals("dmc") && !course.equals("dbda") && !course.equals("dai"))
			throw new StudentHandlingException("Course is not valid");
	}

}
