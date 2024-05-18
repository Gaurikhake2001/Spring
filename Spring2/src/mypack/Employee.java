package mypack;

public class Employee {
	
	private int id;
	private String name;
	private float salary;
	
	private Address add;
	public Employee(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void display()
	{
		System.out.println("Employee Id:"+id);
		System.out.println("Employee Name:"+name);
		System.out.println("Employee Salary:"+salary);
		System.out.println("Address:"+add);
	}

}
