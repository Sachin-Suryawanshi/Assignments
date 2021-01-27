
public class Manager extends Employee1 {

	double foodAllowance,managerAllowance,otherAllowance;
	public Manager(int empId, String empName, double basicSalary, double medical) {
		super(empId, empName, basicSalary, medical);
		this.foodAllowance=0.08*basicSalary;
		this.managerAllowance=0.1*basicSalary;
		this.otherAllowance=0.03*basicSalary;
	}
	public double grossSalaryCal()
	{
		this.grossSalary=super.grossSalaryCal()+this.foodAllowance+this.managerAllowance+this.otherAllowance;
	    return this.grossSalary;
	}
	
	public double netSalaryCal()
	{
		this.netSalary=super.netSalaryCal();
		return this.netSalary;
	}
	

}
