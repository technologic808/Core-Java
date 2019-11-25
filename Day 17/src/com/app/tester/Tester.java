package com.app.tester;

import static com.com.app.util.HelperUtils.*;
import static java.time.LocalDate.*;

import java.util.Scanner;

import com.app.dao.Dao;
import com.app.dao.IDao;
import com.com.app.dao.*;

/**
 * Tester
 */
public class Tester {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            Boolean loop = true;
            Integer key = 0, course_id, student_id;
            String courseName, name, email, address;
            LocalDate dob;
            Double marks;
            IDao dao = new Dao();

            while (loop) {
                try {
                    menu();
                    key = sc.nextInt();

                    switch (key) {
                    case 1:
                        // Display student details for Course
                        System.out.println("Please enter course name: ");
                        courseName = sc.nextLine();
                        System.out.println(dao.getStudentDetails(courseName));
                        break;
                    case 2:
                        // Admission form for Student
                        System.out.println("Enter name: ");
                        name = sc.nextLine();
                        System.out.println("Enter email: ");
                        email = sc.nextLine();
                        System.out.println("Enter address: ");
                        address = sc.nextLine();
                        System.out.println("Enter date of birth (YYYY-MM-DD): ");
                        dob = parse(sc.nextLine());
                        break;
                    case 3:
                        // Display topper for Course
                        break;
                    case 4:
                        // Cancel Admission for Student
                        break;
                    case 5:
                        // Update Marks for Student
                        break;
                    case 10:
                        loop = false;
                        break;

                    default:
                        break;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}