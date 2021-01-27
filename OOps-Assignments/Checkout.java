package day4prac;

public class Checkout {
	Dessertitem cashRegister[];
	public void addItem(Dessertitem item[])
	{
		this.cashRegister=item;
	}
	
	public double getTotalCost()
	{
		double totalCost=0;
		if(cashRegister!=null)
		{
			for(Dessertitem d:cashRegister)
			{
				totalCost+=d.getCost();
			}
			return totalCost;
		}
		else
		{
			System.err.println("Cart is empty");
			return 0;
		}
	}
	
	public int noOfItems()
	{
		if(cashRegister!=null)
		{
			return cashRegister.length;
		}
		else
		{
			System.err.println("Cart is empty");
			return 0;
		}
	}
	@Override
	public String toString() {
		if(cashRegister!=null)
		{
			System.out.println("###########INVOICE##########");
			String s="";
			for(Dessertitem d :cashRegister)
			{
				s=s+d.getName()+"<=========>"+d.getCost()+"\n";
			}
			s=s+this.getTotalCost();
			return s;
		}
		else
		{
			System.err.println("Cart is empty!!!!");
			return null;
		}
		
	}
	public void clear()
	{
		if(cashRegister!=null)
		{
			cashRegister=null;
			
		}
		else
		{
			System.err.println("Cart is empty!!!");
		}
	}

}
