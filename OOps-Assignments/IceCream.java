package day4prac;

public class IceCream  extends Dessertitem{
	double cost_Of_IceCream;
	public IceCream() {
		
	}
	public IceCream(String name)
	{
		super(name);
		this.cost_Of_IceCream=100;
		
	}
	@Override
	public double getCost() {
		
		return this.cost_Of_IceCream;
	}

}
