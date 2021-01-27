package day4prac;

public class Candy extends Dessertitem {
	double weight,price;
	public Candy() {
	
	}
	

	public Candy(String name,double weight) {
		super(name);
		this.weight = weight;
		this.price = 50;
	}


	@Override
	public double getCost() {
		
		return (this.weight*this.price)/1000;
	}

}
