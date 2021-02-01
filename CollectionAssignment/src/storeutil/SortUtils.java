package storeutil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.thinkitive.Book;

public class SortUtils {
	public static void sortByName(List<Book> blist)
	{
		Collections.sort(blist,new SortByName());
		for(Book b:blist)
		{
			System.out.println(b);
		}
	}
	public static void sortByPrice(List<Book> blist)
	{
		Collections.sort(blist,new SortByPrice());
		for(Book b:blist)
		{
			System.out.println(b);
		}
	}

}
