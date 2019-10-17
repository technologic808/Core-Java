package com;

public class Manager extends Employee {

	private double perfBonus;
	
	public Manager(String name, String email, String deptId, double basic, double perfBonus ) {
		super(name, email, deptId, basic);
		this.perfBonus = perfBonus;
	}
	
	@Override
	public String toString() {
		System.out.println("\nManager Details\n");
		return super.toString() + "\nPerformance Bonus: " + perfBonus + "\nNet Salary: " + computeNetSalary() + "\n";
	}
	
	public double computeNetSalary() {
		return basic + perfBonus;
	}
	
	public double getPerfBonus() {
		return perfBonus;
	}

}
