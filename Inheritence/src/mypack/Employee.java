package mypack;

public class Employee extends Person{
	private int id;
	private float sal;
	
	public Employee(String name, String gender, int id, float sal) {
		super(name, gender);
		this.id = id;
		this.sal = sal;
	}

    public void display()
	{
		
		System.out.println("Name of Person: "+name);
		System.out.println("Gender of Person: "+gender);
		System.out.println("ID of Employee: "+id);
		System.out.println("Salary of Employee: "+sal);
		
	}

	
}
