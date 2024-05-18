package mypack;

public class Employee {
	
	private int id;
	private float sal;
	private String name;
	private Address add;
	

	public Employee(int id, float sal, String name, Address add) {
		super();
		this.id = id;
		this.sal = sal;
		this.name = name;
		this.add = add;
	}



	public void display()
	{
		System.out.println("Employee Id:"+id);
		System.out.println("Employee Name:"+name);
		System.out.println("Employee Salary:"+sal);
		System.out.println("Address:"+add);
	}

}
