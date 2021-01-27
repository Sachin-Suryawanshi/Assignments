package day4prac;

public class Book {
	private String book_Name,Category,autor;
	private int id;
	private double cost;
	public Book(String book_Name, String category, String autor, int id, double cost) {
		super();
		this.book_Name = book_Name;
		Category = category;
		this.autor = autor;
		this.id = id;
		this.cost = cost;
	}
	public String getBook_Name() {
		return book_Name;
	}
	public void setBook_Name(String book_Name) {
		this.book_Name = book_Name;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Book [book_Name=" + book_Name + ", Category=" + Category + ", autor=" + autor + ", id=" + id + ", cost="
				+ cost + "]";
	}
	

}
