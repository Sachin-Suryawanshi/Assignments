package day4prac;

public abstract class Dessertitem {
	String name;
	public Dessertitem() {
		
	}
	public Dessertitem(String name) {
		
		this.name = name;
	}
	public abstract double getCost();
	public final String getName()
	{
		return this.name;
	}
	

}
