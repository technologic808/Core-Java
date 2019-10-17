package com;

public class Employee {
	public static int idCounter;
	static {
		idCounter = 100;
	}
	private String name, email, deptId;
	double basic;
	private int id;
	
	public Employee(String name,String email,String deptId, double basic) {
		// TODO Auto-generated constructor stub
		id = idCounter++;
		this.name = name;
		this.email = email;
		this.deptId = deptId;
		this.basic = basic;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee ID: " + id + "\nName: " + name + "\nEmail: " + email + "\nDepartment ID: " + deptId + "\nBasic Salary: " + basic ;
	}
	
	public double computeNetSalary() {
		return -1;
	}
	
	public int getId() {
		return id;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	
	public double getBasic() {
		return basic;
	}

}
