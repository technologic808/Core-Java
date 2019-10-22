package com.app.core;

import java.util.Date;

public class Student {
	private String prn, name, email, marks;
	private Date dob;
	private Course course;

	@Override
	public String toString() {
		return "\nStudent [prn=" + prn + ", name=" + name + ", email=" + email + ", marks=" + marks + ", dob=" + dob
				+ ", course=" + course + "]";
	}

	public Student(String prn, String name, String email, String marks, Date dob, Course course) {
		super();
		this.prn = prn;
		this.name = name;
		this.email = email;
		this.marks = marks;
		this.dob = dob;
		this.course = course;
	}

	public Student(String searchPRN) {
		this(searchPRN, null, null, null, null, null);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student)
			return prn.equalsIgnoreCase(((Student) obj).prn);
		return false;
	}

	public String getCourse() {
		return course.toString();
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}

}
