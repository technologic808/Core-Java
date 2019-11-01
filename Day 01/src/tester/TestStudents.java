// 3 Write a TestStudents class in "tester" package
// Accept how many students to enroll in the class , from user.
// Accept student details(w/o gpa) , using loop.
// Accept student scores & compute GPAs , using loop
// Display name of student having highest GPA.

package tester;

import java.util.Scanner;

import com.cdac.core.*;

class TestStudents {
    public static void main(String[] args) {
        int count;
        String name_, email_;
        int age_;

        double quiz, test, assignments;

        Scanner sc = new Scanner(System.in);

        // accept how many students to enroll
        System.out.println("How many students you want to enroll?");
        count = sc.nextInt();
        String temp = sc.nextLine();

        Student[] std = new Student[count];

        for (int i = 0; i < count; i++) {
            System.out.println("Enter Student Details");
            System.out.println("Enter name: ");
            name_ = sc.nextLine();
            System.out.println("Enter email: ");
            email_ = sc.nextLine();
            System.out.println("Enter age: ");
            age_ = sc.nextInt();
            std[i] = new Student(name_, email_, age_);

            // Accept 3 scores
            System.out.println("Please enter quiz score: ");
            quiz = sc.nextDouble();
            System.out.println("Please enter test score: ");
            test = sc.nextDouble();
            System.out.println("Please enter assignments score: ");
            assignments = sc.nextDouble();
            temp = sc.nextLine();

            std[i].computeGPA(quiz, test, assignments);
        }

        // Display name of student with highest GPA

        // Find out highest GPA
        double highest = 0;
        for (Student each : std) {
            if (each.getGPA() > highest) {
                highest = each.getGPA();
            }
        }

        // Find out student with highest GPA
        for (Student each : std) {
            if (each.getGPA() == highest) {
                System.out.println("Student with the highest GPA is " + each.getName());
            }
        }

        sc.close();

    }
}