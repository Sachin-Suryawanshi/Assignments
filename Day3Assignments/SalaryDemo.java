
public class SalaryDemo {
	public static void main(String args[])
	{
		Manager m=new Manager(1,"Abc",10000,2000);
		m.empDetails();
		System.out.println();
		MarketingExceutive me=new MarketingExceutive(1,"xyz",10000,2000,50);
		me.empDetails();
	}

}
