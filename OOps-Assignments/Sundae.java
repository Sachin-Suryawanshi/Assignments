package day4prac;

public class Sundae extends IceCream{
	double topping_Cost;
	public Sundae() {
		
	}
	public Sundae(String name) {
		super(name);
		this.topping_Cost = 20;
	}
	
	public double getCost()
	{
		return super.getCost()+this.topping_Cost;
	}
	

}
