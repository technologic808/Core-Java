package utils;

import school.Course;
import school.Student;
import schoolexception.StudentHandlingException;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;


public class ValidationRules {
    public static String validateName(String name) throws StudentHandlingException {
        if   (name.length() < 4 || name.length() > 10)
            throw new StudentHandlingException("Invalid Name!");
        else
            return name;
    }

    public static String validateEmail(String email) throws StudentHandlingException {
        if   ((email.length() < 4 || email.length() > 10) || !email.contains("@"))
            throw new StudentHandlingException("Invalid Email!");
        else
            return email;
    }

    public static Course validateCourse(String course) throws StudentHandlingException {
        try {
            return Course.valueOf(course.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new StudentHandlingException("Invalid Course!");
        }
    }

    public static Date validateDate(String dateString) throws StudentHandlingException {

        try {
            SimpleDateFormat sdf       = new SimpleDateFormat("dd.MM.yyyy");
            Date             date      = sdf.parse(dateString);
            Date             threshold = sdf.parse("01.01.1985");
            if   (threshold.compareTo(date) > 0)
                throw new StudentHandlingException("DOB need to greater than 01.01.1985");
            else
                return date;
        } catch (ParseException e) {
            throw new StudentHandlingException("Not a valid date");
        }

    }

    public static String validatePRN(HashMap<String, Student> temp, String prn) throws StudentHandlingException {
        if (temp.containsKey(prn))
            throw new StudentHandlingException("Student with PRN " + prn + "Already exists!");
        return prn;
    }

    public static int validateMarks(int marks) throws StudentHandlingException {
        if (marks > 100 || marks < 0) {
            throw new StudentHandlingException("Marks out of Range! (0 < Marks < 101 )");
        }
        return marks;
    }

}
