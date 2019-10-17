package com.app.core;

public class Student {
	private String prn, name, email, marks, course;

	public Student(String prn, String name, String email, String marks, String course) {
		super();
		this.prn = prn;
		this.name = name;
		this.email = email;
		this.marks = marks;
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [prn=" + prn + ", name=" + name + ", email=" + email + ", marks=" + marks + ", course=" + course
				+ "]";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Student)
//		return this.prn == ((Student)obj).prn;
			return prn.equals(((Student) obj).prn);
		return false;
	}
}
