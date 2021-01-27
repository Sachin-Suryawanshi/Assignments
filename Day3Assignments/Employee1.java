
public class Employee1 {
	int empId;
	String empName;
	double basicSalary,hra,pf,pt,medical,grossSalary,netSalary;
	static String companyName="Thinkitive";
//	static int count=10000;
//	static int num=0;
	public Employee1(int empId,String empName,double basicSalary,double medical)
	{
		this.empId=empId;
		this.empName=empName;
		this.basicSalary=basicSalary;
		this.medical=medical;
		this.pt=200;
		this.hra=0.5*basicSalary;
		this.pf=0.12*basicSalary;
	}
	
	public double grossSalaryCal()
	{
		this.grossSalary=basicSalary+hra+medical;
		return this.grossSalary;
	}
	
	public double netSalaryCal()
	{
		this.netSalary=grossSalaryCal()-pf-pt;
		return this.netSalary;
	}
	public void empDetails()
	{
		System.out.println("Emp ID :"+this.empId);
		System.out.println("EmpName "+this.empName);
		System.out.println("EmpGross Salary :"+this.grossSalaryCal());
		System.out.println("Net Salary :"+this.netSalaryCal());
	}
	

}
