package test;

public class Student {
	public static void main (String[] args) {
		Person student = new Person();
		student.setName("ntpthao \n");
		student.setAge(23);
		System.out.println(student.getName() + student.getAge());
	}
}
