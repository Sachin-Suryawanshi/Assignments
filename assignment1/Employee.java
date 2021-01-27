package assignment1;

public class Employee {
	int empId;
	String empName;
	double basicSalary,hra,pf,pt=200,medical,grossSalary,netSalary;
	static String companyName="Thinkitive";
	static int count=10000;
	static int num=0;
	public Employee()
	{
		num++;
		this.empId=count;
		count++;
	}
	public Employee(int empId, String empName, double basicSalary,double medical) {
		
		this();
		this.empName = empName;
		this.basicSalary = basicSalary;
		this.hra = 0.5*basicSalary;
		this.pf = 0.12*basicSalary;
		this.pt = 200;
		this.medical = medical;
	
	}

	public double grossSalaryCal()
	{
		double gs=basicSalary+hra+medical;
		return gs;
	}
	public double netSalaryCal()
	{
		double net=grossSalaryCal()-pf-pt;
		return net;
	}
	public void empDetails()
	{
		System.out.println("Emp ID :"+this.empId);
		System.out.println("EmpName "+this.empName);
		System.out.println("EmpGross Salary :"+this.grossSalaryCal());
		System.out.println("Net Salary :"+this.netSalaryCal());
	}
	

}
