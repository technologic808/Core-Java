package com.app.core;

import java.util.Date;

public class Student implements Comparable<Student> {
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((prn == null) ? 0 : prn.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (prn == null) {
			if (other.prn != null)
				return false;
		} else if (!prn.equals(other.prn))
			return false;
		return true;
	}

	public Course getCourse() {
		return course;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}

	public String getMarks() {
		return marks;
	}

	public Date getDob() {
		return dob;
	}

	public String getPRN() {
		return prn;
	}

	@Override
	public int compareTo(Student o) {
		return this.prn.compareTo(((Student) o).getPRN());
	}

	public String getName() {
		return name;
	}
}
