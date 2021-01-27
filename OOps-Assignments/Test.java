package day4prac;

public class Test {
	public void main(String args[])
	{
		Checkout ck=new Checkout();
		Candy c=new Candy("Orange",20);
		Cookie c1=new Cookie("Maria",50);
		IceCream ic=new IceCream("Vanilla");
		Sundae s=new Sundae("Chocalate with cherry");
		Dessertitem d[]= {c,c1,ic,s};
		ck.addItem(d);
		System.out.println(ck);
		ck.clear();
	}

}
