package mypack;

public class Student {
	
	private int rollno;
	private String name;
	private float result;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getResult() {
		return result;
	}
	public void setResult(float result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", result=" + result + "]";
	}
	
	

}
