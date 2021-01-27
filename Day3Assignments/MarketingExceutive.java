
public class MarketingExceutive extends Employee1 {
	double tourAllowance,phoneAllowance;
	
	
	public MarketingExceutive(int empId, String empName, double basicSalary, double medical, int travel) {
		super(empId, empName, basicSalary, medical);
		this.tourAllowance=5*travel;
		this.phoneAllowance=1500;
	}
	public double grossSalaryCal()
	{
		this.grossSalary=super.grossSalaryCal()+this.tourAllowance+this.phoneAllowance;
		return this.grossSalary;
	}
	
	public double netSalaryCal()
	{
		this.netSalary=super.netSalaryCal();
		return this.netSalary;
	}
	
	
	

}
