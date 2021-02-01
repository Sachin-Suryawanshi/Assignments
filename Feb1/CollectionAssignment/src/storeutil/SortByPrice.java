package storeutil;

import java.util.Comparator;

import com.thinkitive.Book;

public class SortByPrice implements Comparator<Book>{

	@Override
	public int compare(Book b1, Book b2) {
		// TODO Auto-generated method stub
		return (int) (b1.getPrice()-b2.getPrice());
	}

}
