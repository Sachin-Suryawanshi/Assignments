
public class Demo {
	public static void main(String args[])
	{
		Employee e=new Employee();
		e.setEmpId(1);
		System.out.println(e.getEmpId());
		Emp1 e1=Emp1.getEmployee();
		System.out.println(e1.empid);
		Emp1 e2=Emp1.getEmployee();
		System.out.println(e2.getEmpid());
		
	}

}
