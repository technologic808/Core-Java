package com;

public class Worker extends Employee{

	private double hourlyRate, hoursWorked;
	
	public Worker(String name,String email,String deptId,double basic,double hourlyRate,double hoursWorked) {
		super(name, email, deptId, basic);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}
	
	@Override
	public String toString() {
		System.out.println("\nWorker Details\n");
		return super.toString() + "\nHours Worked: " + hoursWorked + "\nHourly Rate: " + hourlyRate + "\nNet Salary: " + computeNetSalary() + "\n";
	}
	
	public double computeNetSalary() {
		return basic + (hoursWorked * hourlyRate);
	}
	
	public double getHourlyRate() {
		return hourlyRate;
	}
}
