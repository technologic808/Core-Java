package school;

import java.util.Date;
import java.util.HashMap;
import java.util.Objects;

public class Student {
    private String prn, name, email;
    private int marks;
    private Date dob;
    private Course course;

    public Student(String prn, String name, String email, int marks, Date dob, Course course) {
        super();
        this.prn    = prn;
        this.name   = name;
        this.email  = email;
        this.marks  = marks;
        this.dob    = dob;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student Information: " +
               "\n{"                   +
               "\n\tprn      =  "      + prn    + "," +
               "\n\tname     =  "      + name   + "," +
               "\n\temail    =  "      + email  + "," +
               "\n\tmarks    =  "      + marks  + "," +
               "\n\tdob      =  "      + dob    + "," +
               "\n\tcourse   =  "      + course +
               "\n}";
    }

    public String getPrn() {

        return prn;
    }

    public int getMarks() {
        return marks;
    }

    public Course getCourse() {
        return course;
    }

    public static Student searchStudent(HashMap<String, Student> temp, String prn) {
        return temp.get(prn);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Student student = (Student) o;
        return prn.equalsIgnoreCase(student.prn);
    }

    public static void filterByDate(HashMap<String, Student> temp, Date date) {
        for (Student std : temp.values()) {

            if (std.dob.compareTo(date) > 0)
                System.out.println(std);
        }
    }

    public static void filterByCourse(HashMap<String, Student> temp, Course course) {
        for (Student std : temp.values())
            if (std.course == course)
                System.out.println(std);
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public int hashCode() {
        System.out.println("HashCode = " + Objects.hash(prn));
        return Objects.hash(prn);
    }

}


/*
        Using Getter
        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;
            Student student = (Student) o;
            return getPrn().equals(student.getPrn());
        }

        @Override
        public int hashCode() {
            return Objects.hash(getPrn());
        }
    */

