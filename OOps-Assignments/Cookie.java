package day4prac;

public class Cookie extends Dessertitem{
	int no_Of_units;
	double price_Per_Dozen;
	public Cookie() {
		
	}
	

	public Cookie(String name,int no_Of_units) {
		super(name);
		this.no_Of_units = no_Of_units;
		this.price_Per_Dozen =200;
	}


	@Override
	public double getCost() {
		
		return (this.no_Of_units*this.price_Per_Dozen)/12;
	}

}
