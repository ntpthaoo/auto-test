package test;

import java.util.Random;

public class Employee {
	private String name;
	private String id;
	private int salary;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getSalary() {
		return salary;
		
	}
	Employee() {
		Random rd = new Random();
		this.salary = rd.nextInt(5000000, 45000000);
	}

	public static void analyse(int salary1) {
		if (salary1 <= 7000000) {
			System.out.println("Low Salary");
		}
		else if (salary1 > 7000000 && salary1 < 15000000) {
			System.out.println("Normal Salary");
		}
		else  {
			System.out.println("High Salary");
		}
	}
	
	
	
}
