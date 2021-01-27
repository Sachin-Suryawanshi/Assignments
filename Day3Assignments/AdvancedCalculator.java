
public class AdvancedCalculator extends Calculator{
	public AdvancedCalculator(int a,int b)
	{
		
	}
	public int factorial(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact*=i;
		}
		return fact;
	}
	public int div(int a, int b)
	{
		System.out.println(super.div(a, b));
		return a%b;
	}
	public AdvancedCalculator demo()
	{
		return null;
	}

}
