// 2. Solve this.
// Create java application for the following.
// Create Student class in a package "com.cdac.core"
// 2.1 Every student must have
// --- id(int) --if possible system generated(clue : use static id counter),
// name (String), email(String), age(int), gpa (double)

// 2.2 Add suitable parameterized constructor.
// Don't accept gpa in constructor , since it has to be computed.

// 2.3 Add a method getDetails to fetch complete student details
// (ret type -- String)

// 2.4 Add computeGPA method in Student class
// Accept 3 scores for quiz , test & assignments
// GPA should be computed on 20 % of quiz score,
// 50% of test score & 30% of assignment score.

package com.cdac.core;

import java.util.Scanner;

public class Student {
    private int _id;
    private String name;
    private String email;
    private int age;
    private double gpa;
    public static int counter = 0;

    // Parametrized constructor

    public Student(String name_, String email_, int age_) {
        _id = ++counter;
        name = name_;
        email = email_;
        age = age_;
    }

    public String getDetails() {
        return "ID: " + _id + "\n" + "Name: " + name + "\n" + "Email: " + email + "\n" + "Age: " + age + "\n" + "GPA: "
                + gpa + "\n";
    }

    public double getGPA() {
        return gpa;
    }

    public String getName() {
        return name;
    }

    public void computeGPA(double quiz, double test, double assignments) {

        this.gpa = 0.2 * quiz + 0.5 * test + 0.3 * assignments;
    }
}