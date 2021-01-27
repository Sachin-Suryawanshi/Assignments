
public class Demo1 {
	public static void main(String args[])
	{
		Employee1 e=new Employee1(12,"abc",10000,2000);
		Manager m=new Manager(15,"mno",10000,2000);
		MarketingExceutive me=new MarketingExceutive(20,"xyz",10000,2000,50);
		Employee1 arr[]= {e,m,me};
		for(int i=0;i<arr.length;i++)
		{
			arr[i].empDetails();
			System.out.println();
		}
	}

}
