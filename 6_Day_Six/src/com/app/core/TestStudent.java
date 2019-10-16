package com.app.core;

import java.util.Scanner;

import static utils.ValidationRules.*;

import cust_excs.StudentHandlingException;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner sc = new Scanner(System.in)) {

			int limit = 4;
			Student[] s = new Student[limit];

			s[0] = new Student("dac-001", "Student One", null, null, null);
			limit--;
			s[1] = new Student("dac-002", "Student Two", null, null, null);
			limit--;
			s[2] = new Student("dac-003", "Student Three", null, null, null);
			limit--;
			

			Student tempStudent;
			
			System.out.println("Enter Student PRN: ");
			String prn = sc.nextLine();
			
			System.out.println("Enter Student Name: ");
			String name = sc.nextLine();
			
			validateName(name);
			
			System.out.println("Enter Email: ");
			String email = sc.nextLine(); 
			
			validateEmail(email);
			
			System.out.println("Enter Course: ");
			String course = sc.nextLine(); 
			
			validateCourse(course);
			
			tempStudent = new Student(prn, name, email, null, course);
			

			for (Student st : s) {
				if (st == null)
					continue;
				if (st.equals(tempStudent)) {
					throw new StudentHandlingException("Duplicate Student");
				}
			}

			s[3] = tempStudent;
			limit--;
			for (Student st : s) {
				if (st == null)
					continue;
				System.out.println(st);
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}

}
