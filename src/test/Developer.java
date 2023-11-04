package test;

public class Developer {
	public static void main (String[] args) {
		Employee employee = new Employee();
		employee.setName("ntpthao \n");
		employee.setId("12ab34cd \n");
		
		
		System.out.println("Ten nhan vien: " +employee.getName() + "\nMa nhan vien:" +employee.getId() + "\nLuong:" + employee.getSalary() + " VND");
		System.out.println("");
		employee.analyse(employee.getSalary());
	}
}
