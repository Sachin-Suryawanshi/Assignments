
public class Emp1 {
	int empid;
	String empName;
	double salary;
	static int count = 1;
	static Emp1 e;

	private Emp1() {
		this.empid = 1;
		this.empName = "Sachin";
		this.salary = 100000;
	}

	public static Emp1 getEmployee()
	{
		if(e==null)
	{
		e=new Emp1();
		return e;
	}
		else
		{
			System.out.println("Already Exits");
			return e;
		}
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
