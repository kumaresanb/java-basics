package com.evolvus.object.relationship;

public class Association {

	public static void main(String[] args) {
		Bank bank=new Bank("ENBD");
		Employee employee=new Employee("Kumaresan");
		
		System.out.println(employee.getEmployeeName()+" is employee of "+bank.getBankName());
	}

}
